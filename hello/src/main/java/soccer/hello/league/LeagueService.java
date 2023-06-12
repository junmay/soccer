package soccer.hello.league;

import soccer.hello.league.League;
import soccer.hello.league.LeagueMapper;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LeagueService {
    private final LeagueMapper leagueMapper;

    public LeagueService(LeagueMapper leagueMapper) {
        this.leagueMapper = leagueMapper;
    }

    public List<League> getAllLeagues() {
        return leagueMapper.getAllLeagues();
    }
}
