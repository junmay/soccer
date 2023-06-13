package soccer.hello.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import soccer.hello.domain.Player;
import soccer.hello.Repository.PlayerRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PlayerService implements PlayerServi{
//    private final LeagueMapper leagueMapper;

    private  final PlayerRepository playerRepository;


    public List<Player> getAllPlayers(){
        return playerRepository.getAllPlayers();
    }

    public Optional<Player> findPlayer(int playerId){
        return playerRepository.findPlayer(playerId);
    }




//    public LeagueService(LeagueMapper leagueMapper) {
//        this.leagueMapper = leagueMapper;
//    }

//    public List<League> getAllLeagues() {
//        return leagueMapper.getAllLeagues();
//    }



}
