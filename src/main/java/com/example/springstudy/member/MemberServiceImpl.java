package com.example.springstudy.member;

public class MemberServiceImpl implements MemberService{
    private MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member find(Long id) {
        return memberRepository.findById(id);
    }
}
