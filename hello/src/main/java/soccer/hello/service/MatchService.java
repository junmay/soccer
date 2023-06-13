package soccer.hello.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import soccer.hello.Repository.LeagueRepository;
import soccer.hello.Repository.MatchRepository;
import soccer.hello.domain.League;
import soccer.hello.domain.Match;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MatchService implements MatchServi{
//    private final LeagueMapper leagueMapper;

    private  final MatchRepository matchRepository;


    public List<Match> getAllMatches(){
       return matchRepository.getAllMatches();
    }




//    public LeagueService(LeagueMapper leagueMapper) {
//        this.leagueMapper = leagueMapper;
//    }

//    public List<League> getAllLeagues() {
//        return leagueMapper.getAllLeagues();
//    }



}
