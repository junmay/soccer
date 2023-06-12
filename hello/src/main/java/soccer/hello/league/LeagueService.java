package soccer.hello.league;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import soccer.hello.domain.League;
import soccer.hello.login.Repository.LeagueRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LeagueService implements LeagueServi{
//    private final LeagueMapper leagueMapper;

    private  final LeagueRepository leagueRepository;


    public List<League> getAllLeagues(){
       return leagueRepository.getAllLeagues();
    }




//    public LeagueService(LeagueMapper leagueMapper) {
//        this.leagueMapper = leagueMapper;
//    }

//    public List<League> getAllLeagues() {
//        return leagueMapper.getAllLeagues();
//    }



}
