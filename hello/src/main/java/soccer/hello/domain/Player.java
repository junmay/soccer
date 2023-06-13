package soccer.hello.domain;


import lombok.Data;

@Data
public class Player {
    private Integer teamId;
    private String playerName;
    private Integer playerId;



    @Override
    public String toString() {
        return "{" +
                "teamId=" + teamId +
                ", playerName='" + playerName + '\'' +
                ", playerId='" + playerId + '\'' +
                '}';
    }
}
