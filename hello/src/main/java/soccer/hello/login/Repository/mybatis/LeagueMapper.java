package soccer.hello.login.Repository.mybatis;

import org.apache.ibatis.annotations.Mapper;
import soccer.hello.league.League;

import java.util.List;


@Mapper
public interface LeagueMapper {
    List<League> getAllLeagues();
}
