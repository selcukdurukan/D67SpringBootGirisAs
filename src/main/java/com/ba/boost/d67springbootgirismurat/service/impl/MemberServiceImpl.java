package com.ba.boost.d67springbootgirismurat.service.impl;

import com.ba.boost.d67springbootgirismurat.exception.GlobalException;
import com.ba.boost.d67springbootgirismurat.model.entity.MemberEntity;
import com.ba.boost.d67springbootgirismurat.repository.IMemberRepository;
import com.ba.boost.d67springbootgirismurat.service.IMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements IMemberService {

    private final IMemberRepository memberRepository;
    @Override
    public MemberEntity createMember(MemberEntity m) {
        return memberRepository.save(m);
    }

    @Override
    public MemberEntity getMember(Long id) {
        Optional<MemberEntity> member = memberRepository.findById(id);
//        if(member.isEmpty())
//            throw new GlobalException("Person not found", HttpStatus.NOT_FOUND);
        return member.get();
    }

    @Override
    public void deleteMember(Long id) {
        memberRepository.deleteById(id);
    }
}
