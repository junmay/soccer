package soccer.hello.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import soccer.hello.domain.Match;
import soccer.hello.service.LeagueServi;
import soccer.hello.service.MatchServi;

import java.util.List;

//@RestController
@Controller
@Slf4j
@RequiredArgsConstructor
public class MatchController {
    @Autowired
    private final MatchServi matchService;

//    public LeagueController(LeagueService leagueService) {
//        this.leagueService = leagueService;
//    }

//    @GetMapping("/leagues")
//    public List<League> getAllLeagues() {
//        return leagueService.getAllLeagues();
//    }


    @GetMapping ("/matches")
    public String getAllMatches(Model model) {
        List<Match> matches = matchService.getAllMatches();
        log.info(matches+" ");

        model.addAttribute("matches",matches);
        return "main_1";
    }
}
