package soccer.hello.teamRepository.mybatis;

import org.apache.ibatis.annotations.Select;
import soccer.hello.domain.Team;

import java.util.List;

public interface TeamMapper {
    @Select("SELECT * FROM team")
    List<Team> getAllTeams();

}

