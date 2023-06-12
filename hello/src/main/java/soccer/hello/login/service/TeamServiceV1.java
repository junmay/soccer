package soccer.hello.login.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import soccer.hello.domain.Team;
import soccer.hello.login.Repository.TeamRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamServiceV1 implements TeamService{
//    private final LeagueMapper leagueMapper;

    private  final TeamRepository teamRepository;



    @Override
    public List<Team> getAllTeam(){
       return teamRepository.getAllTeam();
    }




//    public LeagueService(LeagueMapper leagueMapper) {
//        this.leagueMapper = leagueMapper;
//    }

//    public List<League> getAllLeagues() {
//        return leagueMapper.getAllLeagues();
//    }



}
