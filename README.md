# 스프링 부트와 AWS로 혼자 구현하는 웹 서비스 실습 목차

# 03장 스프링 부트에서 JPA로 데이터베이스 다뤄보자 <br>
3.1 JPA 소개 <br>
Spring Data JPA <br>
실무에서 JPA <br>
요구사항 분석 <br>
3.2 프로젝트에 Spring Data Jpa 적용하기 <br>
3.3 Spring Data JPA 테스트 코드 작성하기 <br>
3.4 등록/수정/조회 API 만들기 <br>
3.5 JPA Auditing으로 생성시간/수정시간 자동화하기 <br>
LocalDate 사용 <br>
JPA Auditing 테스트 코드 작성하기 <br>

# 04장 머스테치로 화면 구성하기 <br>
4.1 서버 템플릿 엔진과 머스테치 소개 <br>
머스테치란 <br>
머스테치 플러그인 설치 <br>
4.2 기본 페이지 만들기 <br>
4.3 게시글 등록 화면 만들기 <br>
4.4 전체 조회 화면 만들기 <br>
4.5 게시글 수정, 삭제 화면 만들기 <br>
게시글 수정 <br>
게시글 삭제 <br>

# 05장 스프링 시큐리티와 OAuth 2.0으로 로그인 기능 구현하기 <br>
5.1 스프링 시큐리티와 스프링 시큐리티 Oauth2 클라이언트 <br>
5.2 구글 서비스 등록 <br>
5.3 구글 로그인 연동하기 <br>
스프링 시큐리티 설정 <br>
로그인 테스트 <br>
5.4 어노테이션 기반으로 개선하기 <br>
5.5 세션 저장소로 데이터베이스 사용하기 <br>
5.6 네이버 로그인 <br>
_네이버 API 등록 <br>
_스프링 시큐리티 설정 등록 <br>
5.7 기존 테스트에 시큐리티 적용하기 <br>

# 06장 AWS 서버 환경을 만들어보자 - AWS EC2  <br> <br>
_6.1 AWS 회원 가입 <br>
_6.2 EC2 인스턴스 생성하기 <br> <br>
_6.3 EC2 서버에 접속하기 <br>
_6.4 아마존 리눅스 1 서버 생성 시 꼭 해야 할 설정들 <br>

# 07장 AWS에 데이터베이스 환경을 만들어보자 - AWS RDS <br>
_7.1 RDS 인스턴스 생성하기 <br>
_7.2 RDS 운영환경에 맞는 파라미터 설정하기 <br>
_7.3 내 PC에서 RDS에서 접속해 보기 <br>
__Database 플러그인 설치 <br>
_7.4 EC2에서 RDS에서 접근 확인 <br>
 
# 08장 EC2 서버에 프로젝트를 배포해 보자 <br>
_8.1 EC2에 프로젝트 Clone 받기 <br>
_8.2 배포 스크립트 만들기 <br>
_8.3 외부 Security 파일 등록하기 <br>
_8.4 스프링 부트 프로젝트로 RDS 접근하기 <br>
__RDS 테이블 생성 <br>
__프로젝트 설정 <br>
__EC2 설정 <br>
_8.5 EC2에서 소셜 로그인하기 <br>
