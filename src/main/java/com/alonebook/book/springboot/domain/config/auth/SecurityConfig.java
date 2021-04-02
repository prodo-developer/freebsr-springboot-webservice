package com.alonebook.book.springboot.domain.config.auth;

import com.alonebook.book.springboot.domain.user.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @EnableWebSecurity :Spring Security 설정들을 활성화
 * csrf().disable().headers().frameOption().disalbe()
 * h2-console 화면을 사용하기 위해 해당 옵션들을 disable 합니다.
 * authorizeRequests : URL별 권한관리를 설정하는 옵션의 시작점입니다.
 * anyRequest : 설정된값들 이외 나머지 url들을 나타냅니다.
 * oauth2Login : OAuth2 로그인 기능에 대한 여러 설정의 진입점입니다.
 * userInfoEndpoint : OAuth 로그인 성공 이후 사용자 정보를 가져올 떄의 설정들을 담당합니다.
 */
@RequiredArgsConstructor
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final CustomOAuth2UserService customOAuth2UserService;

    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .headers().frameOptions().disable()
                .and()
                .authorizeRequests()
                .antMatchers("/", "/css/**", "/images/**", "/js/**", "/h2-console/**", "/profile").permitAll()
                .antMatchers("/api/v1/**").hasRole(Role.USER.name())
                .anyRequest().authenticated()
                .and()
                .logout()
                .logoutSuccessUrl("/")
                .and()
                .oauth2Login()
                .userInfoEndpoint()
                .userService(customOAuth2UserService);
    }

}
