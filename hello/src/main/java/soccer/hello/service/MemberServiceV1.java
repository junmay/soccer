package soccer.hello.service;

import lombok.extern.slf4j.Slf4j;
import soccer.hello.Repository.MemberRepository;
import soccer.hello.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class MemberServiceV1 implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public Member save(Member member) {
        return memberRepository.save(member);
    }


    @Override
    public Optional<Member> findById(String memberId) {
        log.info("MemberServiceV1] id = " + memberId);
        return memberRepository.findById(memberId);
    }
    @Override
    public Member login(String id, String password){

        log.info("MemberServiceV1] id = " + id+  " "+password+"   아이디 및 비번체크");
        Optional<Member> member = memberRepository.findById(id);
        log.info("MemberServiceV1");
        log.info("MemberServiceV1] member = " + member);

        if(member.get().getMemberPassword().equals(password)){
            return member.get();
        }

        return null;
    }

}
