package soccer.hello.login.Repository;

import soccer.hello.domain.League;
import soccer.hello.domain.Team;

import java.util.List;


public interface TeamRepository {

//    Member save(Member member);

//    Optional<Member> findById(String memberId);


    List<Team> getAllTeam();


}
