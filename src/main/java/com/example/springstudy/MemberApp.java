package com.example.springstudy;

import com.example.springstudy.member.Grade;
import com.example.springstudy.member.Member;
import com.example.springstudy.member.MemberService;
import com.example.springstudy.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        AppConfig app = new AppConfig();
        MemberService memberService = app.memberservice();
//        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.find(1L);
        System.out.println("newMember = " + member.getName());
        System.out.println("findMember = " + findMember.getName());
    }
}
