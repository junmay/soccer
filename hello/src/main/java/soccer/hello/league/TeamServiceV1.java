package soccer.hello.league;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import soccer.hello.domain.League;
import soccer.hello.domain.Team;
import soccer.hello.login.Repository.LeagueRepository;
import soccer.hello.login.Repository.TeamRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamServiceV1 implements TeamService{
//    private final LeagueMapper leagueMapper;

    private  final TeamRepository teamRepository;


    public List<Team> getAllTeam(){
       return teamRepository.getAllLeagues();
    }




//    public LeagueService(LeagueMapper leagueMapper) {
//        this.leagueMapper = leagueMapper;
//    }

//    public List<League> getAllLeagues() {
//        return leagueMapper.getAllLeagues();
//    }



}
