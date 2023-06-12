package soccer.hello.league;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface LeagueMapper {
    List<League> getAllLeagues();
}
