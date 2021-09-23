package com.exam.security.domain.dto.member;

import com.exam.security.domain.entity.MemberEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
@NoArgsConstructor
public class MemberDto {

    private Long id;
    private LocalDateTime regDate;
    private LocalDateTime updateDate;
    private String loginId;
    private String loginPw;
    private String name;
    private String email;

    @Builder
    public MemberDto(Long id, String loginId, String loginPw, String name, String email){

        this.id = id;
        this.loginId = loginId;
        this.loginPw = loginPw;
        this.name = name;
        this.email = email;
    }

    public MemberEntity toEntity(){
        return MemberEntity.builder()
                .id(id)
                .loginId(loginId)
                .loginPw(loginPw)
                .name(name)
                .email(email)
                .build();
    }

}
