package soccer.hello.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import soccer.hello.domain.Player;
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

//    @GetMapping("/players")
    public String getAll(){
        log.info("dddd");
        log.info(playerService.getAllPlayers()+"");
        return "index";
    }


    @PostMapping
    public String findPlayer(){
        int playerId=0;
        Player player = playerService.findPlayer(playerId).get();
        log.info(player+"");

        return "redircet:/p";
    }


}
