package soccer.hello.domain;


import lombok.Data;

@Data
public class Player {
    private Long teamId;
    private String playerName;
    private Long playerId;



    @Override
    public String toString() {
        return "League{" +
                "teamId=" + teamId +
                ", playerName='" + playerName + '\'' +
                ", playerId='" + playerId + '\'' +
                '}';
    }
}
