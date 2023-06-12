package soccer.hello.Repository.mybatis;

import org.apache.ibatis.annotations.Mapper;
import soccer.hello.domain.League;

import java.util.List;


@Mapper
public interface LeagueMapper {
    List<League> getAllLeagues();
}
