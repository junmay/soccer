package soccer.hello.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import soccer.hello.domain.Team;
import soccer.hello.Repository.TeamRepository;

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


    public List<Team> getChelsea() {

        teamRepository.getAllTeam();
        Team chel = new Team();
        chel.getTeamName().equals("chelsea");
        return getChelsea();
    }


    //    public LeagueService(LeagueMapper leagueMapper) {
//        this.leagueMapper = leagueMapper;
//    }

//    public List<League> getAllLeagues() {
//        return leagueMapper.getAllLeagues();
//    }



}
