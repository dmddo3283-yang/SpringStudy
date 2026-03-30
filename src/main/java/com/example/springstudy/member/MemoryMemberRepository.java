package com.example.springstudy.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {
    private static Map<Long, Member> members = new HashMap<>();

    @Override
    public void save(Member member) {
        members.put(member.getId(), member);
    }

    @Override
    public Member findById(String id) {
        return members.get(id);
    }
}
