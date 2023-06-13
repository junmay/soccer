package soccer.hello.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import soccer.hello.domain.Player;
import soccer.hello.Repository.PlayerRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class PlayerService implements PlayerServi{
//    private final LeagueMapper leagueMapper;

    private  final PlayerRepository playerRepository;


    public List<Player> getAllPlayers(){
        return playerRepository.getAllPlayers();
    }

    public List<Player> findPlayer(Long playerId){
        log.info("PlayerService \n");
        return playerRepository.findPlayer(playerId);
    }




//    public LeagueService(LeagueMapper leagueMapper) {
//        this.leagueMapper = leagueMapper;
//    }

//    public List<League> getAllLeagues() {
//        return leagueMapper.getAllLeagues();
//    }



}
