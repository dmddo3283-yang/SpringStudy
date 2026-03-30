package com.example.springstudy;

import com.example.springstudy.discount.FixDiscountPolicy;
import com.example.springstudy.member.MemberService;
import com.example.springstudy.member.MemberServiceImpl;
import com.example.springstudy.member.MemoryMemberRepository;
import com.example.springstudy.order.OrderService;
import com.example.springstudy.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberservice() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
