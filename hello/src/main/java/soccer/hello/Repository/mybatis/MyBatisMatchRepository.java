package soccer.hello.Repository.mybatis;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import soccer.hello.Repository.LeagueRepository;
import soccer.hello.Repository.MatchRepository;
import soccer.hello.domain.League;
import soccer.hello.domain.Match;

import java.util.List;


@Slf4j
@Repository
@RequiredArgsConstructor
public class MyBatisMatchRepository implements MatchRepository {

//    private final MemberMapper memberMapper;
    private final MatchMapper matchMapper;

//    @Override
//    public Member save(Member member) {
//        log.info("itemMapper class={}", memberMapper.getClass());
//        memberMapper.save(member);
//        return member;
//    }


//    @Override
//    public Optional<Member> findById(String id) {
//        log.info("MyBatisMemberRepository의 findById 매서드 실행");
//        return memberMapper.findById(id);
//    }


    @Override
    public List<Match> getAllMatches() {
        return matchMapper.getAllMatches();
    }
}
