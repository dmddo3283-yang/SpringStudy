package com.example.springstudy.order;

import com.example.springstudy.AppConfig;
import com.example.springstudy.member.Grade;
import com.example.springstudy.member.Member;
import com.example.springstudy.member.MemberService;
import com.example.springstudy.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {
    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    public void beforeEach() {
        AppConfig app = new AppConfig();
        memberService = app.memberservice();
        orderService = app.orderService();
    }

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
