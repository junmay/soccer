package soccer.hello.login.Repository.mybatis;

import org.apache.ibatis.annotations.Mapper;
import soccer.hello.domain.League;
import soccer.hello.domain.Player;

import java.util.List;


@Mapper
public interface PlayerMapper {
    List<Player> getAllPlayers();
}
