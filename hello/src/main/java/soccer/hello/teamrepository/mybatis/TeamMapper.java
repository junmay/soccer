package soccer.hello.teamrepository.mybatis;

import org.apache.ibatis.annotations.Select;
import soccer.hello.team.Team;

import java.util.List;

public interface TeamMapper {
    @Select("SELECT * FROM team")
    List<Team> getAllTeams();

}

