package soccer.hello.web;

import jakarta.persistence.Column;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import soccer.hello.Repository.mybatis.MatchMapper;
import soccer.hello.domain.Match;
import soccer.hello.service.LeagueServi;
import soccer.hello.service.MatchServi;

import java.util.List;

//@RestController
@Controller
@Slf4j
@RequiredArgsConstructor
public class MatchController {

    private final MatchServi matchService;
    private final MatchMapper matchMapper;

//    @PostMapping("/matches")
    public String getAllMatches_2(Model model) {
        log.info("dddd");
        log.info(matchService.getAllMatches() + "");
        List<Match> matches = matchService.getAllMatches();
        model.addAttribute("matches", matches);
        return "main_1";
    }

    @GetMapping("/matches")
    public String getAllMatches(Model model){

        List<Match> matches = matchService.getAllMatches();
        log.info("MatchController] \n \n matches = " + matches);
        model.addAttribute("matches", matches);

        return "main_1";
    }



}


//    @RequestMapping("/matches")
//    public String getAllMatches(Model model) {
//        List<Match> matches = matchService.getAllMatches();
//        log.info("getAllmatches");
//        model.addAttribute("matches", matches);
//        return "redirect:/main_1";
//    }


//    @PostMapping("/matches")
//    public String getAllMatches(Model model) {
//        List<Match> matches = matchService.getAllMatches();
//        log.info("getAllmatches");
//        model.addAttribute("matches", matches);
//        return "redirect:main_1";
//    }
//}

