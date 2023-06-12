package soccer.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import soccer.hello.config.MyBatisConfig;

@Import(MyBatisConfig.class)
@SpringBootApplication(scanBasePackages = "soccer.hello.web")
public class HelloApplication {



//dd //d
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);



	}

}
