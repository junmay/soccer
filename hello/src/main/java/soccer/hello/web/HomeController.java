package soccer.hello.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
//@RequestMapping("/homae")
@RequiredArgsConstructor
@Controller
public class HomeController {

    @GetMapping("/")
    public String main() {
        return "home_1";
    }

    @GetMapping("main_1")
    public String home() {
        return "main_1";
    }



}
