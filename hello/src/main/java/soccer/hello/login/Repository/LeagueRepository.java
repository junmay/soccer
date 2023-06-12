package soccer.hello.login.Repository;

import soccer.hello.domain.Member;
import soccer.hello.league.League;

import java.util.List;
import java.util.Optional;


public interface LeagueRepository {

//    Member save(Member member);

//    Optional<Member> findById(String memberId);


    List<League> getAllLeagues();


}
