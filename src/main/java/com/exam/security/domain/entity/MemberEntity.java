package com.exam.security.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "member")
public class MemberEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="reg_date")
    private LocalDateTime regDate;

    @Column(name="update_date")
    private LocalDateTime updateDate;

    @Column(name="login_id")
    private String loginId;

    @Column(name="login_pw")
    private String loginPw;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    @Builder
    public MemberEntity(String loginId, String loginPw, String name, String email){

        this.loginId = loginId;
        this.loginPw = loginPw;
        this.name = name;
        this.email = email;
    }
}
