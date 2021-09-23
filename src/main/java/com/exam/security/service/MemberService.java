package com.exam.security.service;

import com.exam.security.domain.entity.MemberEntity;
import com.exam.security.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;


    public void save(MemberEntity memberEntity) {
        memberRepository.save(memberEntity);
    }
}
