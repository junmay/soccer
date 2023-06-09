package soccer.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import soccer.hello.config.MyBatisConfig;
import soccer.hello.service.LeagueService;

@Import(MyBatisConfig.class)
@SpringBootApplication(scanBasePackages = "soccer.hello.web")
public class HelloApplication {



	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);

	}

}
