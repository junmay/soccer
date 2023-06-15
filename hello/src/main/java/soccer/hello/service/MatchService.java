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

import java.util.ArrayList;
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

        Match match1 = matchs.get(0);
        Match match2 = matchs.get(1);

        match1.getMatchId();
        match1.getTeam1Id();
        match1.getTeam2Id();
//        int team1Score = match1.getScore1();
//        int team2Score = match1.getScore2();


        matchs.stream().filter(a-> a.equals("chelsea")).toArray();

        return matchRepository.getAllMatches();
    }

    @Override
    public List<Match> getTeamMatchesCehlsea() {
        List<Match> findMatch = matchRepository.getAllMatches();
//            if(getAllMatches().equals("chelsea")){
//            for (Match teamMatch : findMatch) {
//                System.out.println(teamMatch);
//            }
//        }
//        Match ss = findMatch.get(0);
//            int x=0;

            List<Match> chelsea = new ArrayList<>();

            for(int y=0;y<findMatch.size();y++){
                if((findMatch.get(y).getTeam1Id()==0) || findMatch.get(y).getTeam2Id()==0)
                System.out.println(findMatch.get(y).getMatchId());

                chelsea.add(findMatch.get(y));


            }



//        return getTeamMatchesCehlsea();

        return chelsea;
    }


//    public LeagueService(LeagueMapper leagueMapper) {
//        this.leagueMapper = leagueMapper;
//    }

//    public List<League> getAllLeagues() {
//        return leagueMapper.getAllLeagues();
//    }



}
