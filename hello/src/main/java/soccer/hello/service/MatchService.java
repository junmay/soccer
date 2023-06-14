package soccer.hello.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soccer.hello.Repository.LeagueRepository;
import soccer.hello.Repository.MatchRepository;
import soccer.hello.Repository.mybatis.MatchMapper;
import soccer.hello.domain.League;
import soccer.hello.domain.Match;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class MatchService implements MatchServi{
//    private final LeagueMapper leagueMapper;

    private  final MatchRepository matchRepository;


    @Override
    public List<Match> getAllMatches(){

        log.info("안녕하세요 겟 올 매치 입니다. "
        );
       return matchRepository.getAllMatches();
    }

    public List<Match> arrayMatches(){

        List<Match> matchs = matchRepository.getAllMatches();

        return matchRepository.getAllMatches();
    }




//    public LeagueService(LeagueMapper leagueMapper) {
//        this.leagueMapper = leagueMapper;
//    }

//    public List<League> getAllLeagues() {
//        return leagueMapper.getAllLeagues();
//    }



}
