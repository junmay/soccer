package soccer.hello.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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


//    @GetMapping ("/matches")
//    public String getAllMatches() {
//
//        return "main_1";
//    }
      @PostMapping("/matches")
      public String getAllMatches(Model model) {
          List<Match> matches = matchService.getAllMatches();
          model.addAttribute("matches",matches);
          return "redirect:/main_1";

      }
//    @PostMapping("/matches")
//    public String getAllMatches(Model model){
//        List<Match> matches = matchService.getAllMatches();
//        log.info("getAllmatches");
//        model.addAttribute("matches",matches);
//        return "redirect:main_1";
//    }

//    @PostMapping("/matches/{matchesId}")
//    public String getAllMatchesss(Model model){
//        List<Match> matches = matchService.getAllMatches();
//        log.info("getAllmatches sssss");
//        model.addAttribute("matches",matches);
//
//        return "redirect:matches/";
//    }


}
