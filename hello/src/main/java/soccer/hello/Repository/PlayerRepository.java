package soccer.hello.Repository;

import soccer.hello.domain.League;
import soccer.hello.domain.Player;

import java.util.List;
import java.util.Optional;


public interface PlayerRepository {



//    Member save(Member member);

//    Optional<Member> findById(String memberId);


    public List<Player> getAllPlayers();

    public Optional<Player> findPlayer(int playerId);


}
