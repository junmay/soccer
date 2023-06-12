package soccer.hello.login.Repository.mybatis;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import soccer.hello.domain.League;
import soccer.hello.domain.Player;
import soccer.hello.login.Repository.LeagueRepository;
import soccer.hello.login.Repository.PlayerRepository;

import java.util.List;


@Slf4j
@Repository
@RequiredArgsConstructor
public class MyBatisPlayerRepository implements PlayerRepository {

//    private final MemberMapper memberMapper;
    private final PlayerMapper playerMapper;

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
    public List<Player> getAllPlayers() {
        return playerMapper.getAllPlayers();
    }
}
