package soccer.hello.Repository.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import soccer.hello.domain.League;
import soccer.hello.domain.Player;

import java.util.List;
import java.util.Optional;


@Mapper
public interface PlayerMapper {
    List<Player> getAllPlayers();
    List<Player> findPlayer(
            @Param("playerId") Integer playerId,
            @Param("playerName") String playerName,
            @Param("teamId") Integer teamId);
}
