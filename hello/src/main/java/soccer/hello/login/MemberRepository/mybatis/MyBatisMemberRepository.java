package soccer.hello.login.MemberRepository.mybatis;


import soccer.hello.domain.Member;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import soccer.hello.login.MemberRepository.MemberRepository;

import java.util.Optional;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MyBatisMemberRepository implements MemberRepository {

    private final MemberMapper memberMapper;

    @Override
    public Member save(Member member) {
        log.info("itemMapper class={}", memberMapper.getClass());
        memberMapper.save(member);
        return member;
    }


    @Override
    public Optional<Member> findById(String id) {
        return memberMapper.findById(id);
    }

}
