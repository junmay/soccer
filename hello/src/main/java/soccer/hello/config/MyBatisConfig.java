package soccer.hello.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import soccer.hello.Repository.*;
import soccer.hello.Repository.mybatis.*;
import soccer.hello.domain.Match;
import soccer.hello.service.*;

import java.util.List;

/**
 * @Configuration 어노테이션은 스프링에서 Java 기반의 설정 클래스임을 나타내는 어노테이션입니다.
 * 이 어노테이션이 적용된 클래스는 스프링 컨테이너에 의해 빈(Bean)으로 관리되며, 스프링 애플리케이션의 구성(Configuration)을 정의하는 역할을 합니다.
 * @Configuration 어노테이션은 주로 @Bean 어노테이션과 함께 사용됩니다.
 * @Bean 어노테이션은 해당 메소드가 스프링 빈을 생성하여 컨테이너에 등록하도록 지정하는 역할을 합니다.
 * @Bean 어노테이션이 적용된 메소드의 반환 객체는 스프링 빈으로 관리되며, 이를 다른 빈에서 주입(Dependency Injection)하여 사용할 수 있습니다.
 * * @Controller, @Service, @Repository 어노테이션은 주로 컴포넌트 스캔(Component Scan)과 관련하여 사용됩니다.
 * 이 어노테이션들이 적용된 클래스들은 스프링 컨테이너에 의해 자동으로 스캔되어 스프링 빈으로 등록됩니다.
 * 이와 달리 @Configuration 어노테이션이 적용된 클래스는 직접 스프링 빈을 정의하고 등록하는 용도로 사용됩니다.
 * 즉, @Configuration 어노테이션은 스프링의 설정 클래스로 사용되며, @Bean 어노테이션과 함께 사용하여
 * 메소드 단위로 스프링 빈을 등록할 수 있도록 지원합니다.
  */
@Configuration
@Slf4j
@RequiredArgsConstructor
public class MyBatisConfig {

    private final MemberMapper memberMapper;
    private final LeagueMapper leagueMapper;
    private final TeamMapper teamMapper;
    private final PlayerMapper playerMapper;
    private final MatchMapper matchMapper;


    @Bean
    public TeamRepository teamRepository(){

        return new MyBatisTeamRepository(teamMapper);
    }


    @Bean
    public TeamService teamService(){
        return new TeamServiceV1(teamRepository());
    }



    @Bean
    public MemberService memberService() {
        log.info("MyBatisConfig] memberMapper = " + memberMapper + "생성완료");
        return new MemberServiceV1(memberRepository());
    }



    @Bean
    public MemberRepository memberRepository() {
        return new MyBatisMemberRepository(memberMapper);
    }



    @Bean
    LeagueRepository leagueRepository(){
        return new MyBatisLeagueRepository(leagueMapper);
    }

    @Bean
    public LeagueService leagueService(){
        return new LeagueService(leagueRepository());
    }

    @Bean
    public PlayerRepository playerRepository(){
        return new MyBatisPlayerRepository(playerMapper);
    }
    @Bean
    public PlayerServi playerService(){
        return new PlayerService(playerRepository());
    }
    @Bean
    public MatchRepository matchRepository() {
        return new MyBatisMatchRepository(matchMapper);
    }
    @Bean
    public MatchServi matchService(){
        return new MatchService(matchRepository());
    }
}
