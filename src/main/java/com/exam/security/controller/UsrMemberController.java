package com.exam.security.controller;

import com.exam.security.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class UsrMemberController {

    private final MemberService memberService;

}
