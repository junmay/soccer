package soccer.hello.Repository.mybatis;

import org.apache.ibatis.annotations.Mapper;
import soccer.hello.domain.League;
import soccer.hello.domain.Player;

import java.util.List;
import java.util.Optional;


@Mapper
public interface PlayerMapper {
    List<Player> getAllPlayers();

    Optional<Player> findPlayer(int playerId);
}
