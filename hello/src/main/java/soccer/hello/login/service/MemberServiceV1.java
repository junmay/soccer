package soccer.hello.login.service;

import soccer.hello.domain.Member;
import soccer.hello.login.MemberRepository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceV1 implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public Member save(Member member) {
        return memberRepository.save(member);
    }


    @Override
    public Member findById(String id) {
        return memberRepository.findById(id);
    }
    @Override
    public Member login(String id, String password){

        Member member = memberRepository.findById(id);

        return null;
    }

}
