package com.example.springstudy;

import com.example.springstudy.discount.DiscountPolicy;
import com.example.springstudy.discount.FixDiscountPolicy;
import com.example.springstudy.discount.RateDiscountPolicy;
import com.example.springstudy.member.MemberRepository;
import com.example.springstudy.member.MemberService;
import com.example.springstudy.member.MemberServiceImpl;
import com.example.springstudy.member.MemoryMemberRepository;
import com.example.springstudy.order.OrderService;
import com.example.springstudy.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberservice() {
        return new MemberServiceImpl(memberRepository());
    }

    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
