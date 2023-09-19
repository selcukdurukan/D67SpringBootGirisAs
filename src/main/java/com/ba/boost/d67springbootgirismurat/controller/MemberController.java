package com.ba.boost.d67springbootgirismurat.controller;

import com.ba.boost.d67springbootgirismurat.model.entity.MemberEntity;
import com.ba.boost.d67springbootgirismurat.service.IMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final IMemberService memberService;

    /**
     * Postmanden memberEntity doldurup yeni bir member oluşturacğız.
     * @param member
     * @return
     */

    @PostMapping("/create")
    public MemberEntity createMember(@RequestBody MemberEntity member) {
        return memberService.createMember(member) ;
    }

    /**
     * id'ye göre db'den member getirecek.
     * @param memberId
     * @return
     */

    @GetMapping("/{memberId}")
    public MemberEntity getMember(@PathVariable Long memberId) {
        return memberService.getMember(memberId);
    }
}
