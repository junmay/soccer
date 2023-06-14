package soccer.hello.domain;


import lombok.Data;

@Data
public class Player {

    private String playerName;
    private Integer playerId;
    private Integer teamId;


    @Override
    public String toString() {
        return "{" +
                "teamId=" + teamId +
                ", playerName='" + playerName + '\'' +
                ", playerId='" + playerId + '\'' +
                '}';
    }
}
