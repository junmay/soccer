package soccer.hello.web;

import ch.qos.logback.core.model.Model;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import soccer.hello.domain.Team;
import soccer.hello.service.PlayerServi;
import soccer.hello.service.TeamService;

import java.util.List;

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
    //   ============== 팀 ==================
    @GetMapping("/teamInfo/club/chelsea")
    public String chelsea(@ModelAttribute("chelsea") Team team, Model model) {

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
    // ============== 스쿼드 ==================
    @GetMapping("/squad/arsenalSquad")
    public String arsenalSquad() {
        return "club/squad/arsenalSquad";
    }
    @GetMapping("/squad/chelseaSquad")
    public String chelseaSquad() {
        return "club/squad/chelseaSquad";
    }
    @GetMapping("/squad/liverpoolSquad")
    public String liverpoolSquad() {
        return "club/squad/liverpoolSquad";
    }
    @GetMapping("/squad/manchesterSquad")
    public String manchesterSquad() {
        return "club/squad/manchesterSquad";
    }
    //  ============== 프로필 ==================
    @GetMapping("/player/kepa")
    public String kepa() {
        return "club/squad/player/kepa";
    }
}
