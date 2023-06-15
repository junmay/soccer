package soccer.hello.service;

import soccer.hello.domain.League;
import soccer.hello.domain.Player;

import java.util.List;
import java.util.Optional;

public interface PlayerServi {

    public List<Player> getAllPlayers();

    public List<Player> findPlayer(Integer playerId, String playerName, Integer teamId);



}
