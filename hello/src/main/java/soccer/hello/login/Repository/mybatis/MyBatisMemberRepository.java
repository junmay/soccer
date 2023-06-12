package soccer.hello.login.Repository.mybatis;


import soccer.hello.domain.Member;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import soccer.hello.login.Repository.MemberRepository;

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
        log.info("MyBatisMemberRepository의 findById 매서드 실행");
        return memberMapper.findById(id);
    }

}
