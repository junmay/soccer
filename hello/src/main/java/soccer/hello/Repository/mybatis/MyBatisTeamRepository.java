package soccer.hello.Repository.mybatis;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import soccer.hello.domain.Team;
import soccer.hello.Repository.TeamRepository;

import java.util.List;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MyBatisTeamRepository implements TeamRepository {

    private final TeamMapper teamMapper;

    @Override
    public List<Team> getAllTeam(){
        return teamMapper.getAllTeam();
    }


}
