package com.alonebook.book.springboot.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/**
 * Entity의 상위 크랠스가 되어 Entity들의 데이터들을 자동으로 관리하는 역할.
 * @MappedSuperclass : JPA 엔티티 클래스들이 BaseTimeEntity 상속할경우 컬럼들이 인식되게 함.
 * @CreatedDate : BaseTimeEntity 클래스에 Auditing 기능을 포함시킵니다.
 */

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {

    @CreatedDate
    private LocalDateTime createDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;
}
