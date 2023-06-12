package soccer.hello.Repository;

import soccer.hello.domain.League;
import soccer.hello.domain.Player;

import java.util.List;


public interface PlayerRepository {



//    Member save(Member member);

//    Optional<Member> findById(String memberId);


    public List<Player> getAllPlayers();


}
