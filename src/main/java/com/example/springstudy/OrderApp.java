package com.example.springstudy;

import com.example.springstudy.member.Grade;
import com.example.springstudy.member.Member;
import com.example.springstudy.member.MemberService;
import com.example.springstudy.member.MemberServiceImpl;
import com.example.springstudy.order.Order;
import com.example.springstudy.order.OrderService;
import com.example.springstudy.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig app = new AppConfig();
        MemberService memberService = app.memberservice();
        OrderService orderService = app.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("order = " + order);
        System.out.println("order.calculatePrice = " + order.calculatePrice());
    }
}
