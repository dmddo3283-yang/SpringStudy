package com.example.springstudy.member;

import com.example.springstudy.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService memberService;

    @BeforeEach
    public void beforeEach() {
        AppConfig app = new AppConfig();
        memberService = app.memberservice();
    }

    @Test
    void join() {
        Member member = new Member(1L, "memberA", Grade.VIP);

        memberService.join(member);
        Member findMember = memberService.find(1L);

        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
