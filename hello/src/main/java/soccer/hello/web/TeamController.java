package soccer.hello.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import soccer.hello.service.PlayerServi;
import soccer.hello.service.TeamService;

//@RestController
@Controller
@Slf4j
@RequiredArgsConstructor
public class TeamController {
    private final TeamService teamService;


//    public LeagueController(LeagueService leagueService) {
//        this.leagueService = leagueService;
//    }

//    @GetMapping("/leagues")
//    public List<League> getAllLeagues() {
//        return leagueService.getAllLeagues();
//    }

    @GetMapping("/teamInfo")
    public String teamInfo(){
        return "teamInfo";
    }

    @GetMapping("/teamInfo/club/chelsea")
    public String chelsea() {
        return "club/chelsea";
    }

    @GetMapping("/teamInfo/club/liverpool")
    public String liverpool() {
        return "club/liverpool";
    }
    @GetMapping("/teamInfo/club/arsenal")
    public String arsenal() {
        return "club/arsenal";
    }
    @GetMapping("/teamInfo/club/manchester")
    public String manchester() {
        return "club/manchester";
    }





}
