package com.example.springstudy.member;

public interface MemberService {
    void join(Member member);
    Member find(Long id);
}
