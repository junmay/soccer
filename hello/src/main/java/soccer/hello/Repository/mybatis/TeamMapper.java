package soccer.hello.Repository.mybatis;

import org.apache.ibatis.annotations.Mapper;
import soccer.hello.domain.League;
import soccer.hello.domain.Team;

import java.util.List;


@Mapper
public interface TeamMapper {
    List<Team> getAllTeam();
}
