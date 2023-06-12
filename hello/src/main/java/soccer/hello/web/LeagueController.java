package soccer.hello.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import soccer.hello.service.LeagueServi;
import org.springframework.web.bind.annotation.GetMapping;

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
        return "index";
    }


}
