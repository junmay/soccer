package soccer.hello.Repository.mybatis;

import org.apache.ibatis.annotations.Mapper;
import soccer.hello.domain.League;
import soccer.hello.domain.Match;

import java.util.List;


@Mapper
public interface MatchMapper {
    void save(Match match);
    List<Match> getAllMatches();
}
