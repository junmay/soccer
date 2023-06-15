package soccer.hello.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
//@RequestMapping("/homae")
@RequiredArgsConstructor
@Controller
public class HomeController {

    @GetMapping("/")
    public String main() {
        return "home_1";
    }
    @GetMapping("home")
    public String home2() {
        return "home_1";
    }

    @GetMapping("main_1")
    public String home() {
        return "main_1_(zz)";
    }
    @GetMapping("/home_1.html")
    public String homepage() {
        return "home_1";
    }
    @GetMapping("/teamInfo.html")
    public String teampage() {
        return "teamInfo";
    }



//    @GetMapping("loginGo")
    public String loginGo(){
        return "/login";
    }



}
