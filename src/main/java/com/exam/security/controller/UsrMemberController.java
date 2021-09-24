package com.exam.security.controller;

import com.exam.security.domain.dto.member.MemberJoinDto;
import com.exam.security.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UsrMemberController {

    private final MemberService memberService;

    @GetMapping("/member/login")
    public String login(){
        return "/usr/member/login";
    }

    @GetMapping("/member/join")
    public String join(){
        return "/usr/member/join";
    }

    @PostMapping("/member/join")
    public String doJoin(MemberJoinDto memberJoinDto){

        memberService.save(memberJoinDto.toEntity());

        return "redirect:/";
    }

}
