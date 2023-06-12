package soccer.hello.login.Repository.mybatis;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import soccer.hello.domain.Member;
import soccer.hello.domain.Team;
import soccer.hello.login.Repository.MemberRepository;
import soccer.hello.login.Repository.TeamRepository;

import java.util.List;
import java.util.Optional;

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
