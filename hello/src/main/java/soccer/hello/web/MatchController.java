package soccer.hello.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import soccer.hello.service.LeagueServi;
import soccer.hello.service.MatchServi;

//@RestController
@Controller
@Slf4j
@RequiredArgsConstructor
public class MatchController {
    private final MatchServi matchService;

//    public LeagueController(LeagueService leagueService) {
//        this.leagueService = leagueService;
//    }

//    @GetMapping("/leagues")
//    public List<League> getAllLeagues() {
//        return leagueService.getAllLeagues();
//    }

    @GetMapping("/match")
    public String getAll(){
        log.info("dddd");
        log.info(matchService.getAllMatches()+"");
        return "index";
    }


}
