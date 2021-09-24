package com.exam.security.domain.dto.member;

import com.exam.security.domain.entity.MemberEntity;
import lombok.Builder;
import lombok.Getter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Getter
public class MemberJoinDto {

    private String loginId;
    private String loginPw;
    private String name;
    private String email;

    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Builder
    public MemberJoinDto(String loginId, String loginPw, String name, String email){

        this.loginId = loginId;
        this.loginPw = passwordEncoder.encode(loginPw);
        this.name = name;
        this.email = email;
    }

    public MemberEntity toEntity(){
        return MemberEntity.builder()
                .loginId(loginId)
                .loginPw(loginPw)
                .name(name)
                .email(email)
                .build();
    }


}
