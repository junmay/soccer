package soccer.hello.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import soccer.hello.league.League;
import soccer.hello.league.LeagueServi;
import soccer.hello.league.LeagueService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

//@RestController
@Controller
@Slf4j
@RequiredArgsConstructor
public class LeagueController {
    private final LeagueServi leagueService;

//    public LeagueController(LeagueService leagueService) {
//        this.leagueService = leagueService;
//    }

//    @GetMapping("/leagues")
//    public List<League> getAllLeagues() {
//        return leagueService.getAllLeagues();
//    }

    @GetMapping("/leagues")
    public String getAll(){
        log.info("dddd");
        log.info(leagueService.getAllLeagues()+"");
        return "/";
    }


}
