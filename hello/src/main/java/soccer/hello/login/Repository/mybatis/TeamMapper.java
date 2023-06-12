package soccer.hello.login.Repository.mybatis;

import org.apache.ibatis.annotations.Mapper;
import soccer.hello.domain.League;

import java.util.List;


@Mapper
public interface TeamMapper {
    List<League> getAllLeagues();
}
