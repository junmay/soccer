package soccer.hello.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import soccer.hello.service.PlayerServi;

//@RestController
@Controller
@Slf4j
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerServi playerService;

//    public LeagueController(LeagueService leagueService) {
//        this.leagueService = leagueService;
//    }

//    @GetMapping("/leagues")
//    public List<League> getAllLeagues() {
//        return leagueService.getAllLeagues();
//    }

    @GetMapping("/players")
    public String getAll(){
        log.info("dddd");
        log.info(playerService.getAllPlayers()+"");
        return "index";
    }


}
