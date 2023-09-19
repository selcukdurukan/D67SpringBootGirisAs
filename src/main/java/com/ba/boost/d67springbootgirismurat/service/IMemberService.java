package com.ba.boost.d67springbootgirismurat.service;

import com.ba.boost.d67springbootgirismurat.model.entity.MemberEntity;

public interface IMemberService {

    MemberEntity createMember(MemberEntity m);
    MemberEntity getMember(Long id);
    void deleteMember(Long id);

}
