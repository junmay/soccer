package soccer.hello.domain;


import lombok.Data;

@Data
public class Player {
    private int teamId;
    private String playerName;
    private int playerId;



    @Override
    public String toString() {
        return "League{" +
                "teamId=" + teamId +
                ", playerName='" + playerName + '\'' +
                ", playerId='" + playerId + '\'' +
                '}';
    }
}
