package soccer.hello.domain;

import lombok.Data;

@Data
public class Match {
    private int matchId;
    private int teamId;
    private int team2Id;
    private String matchDate;

    @Override
    public String toString() {
        return "Match{" +
                "matchId=" + matchId +
                ", teamId='" + teamId + '\'' +
                ", team2Id='" + team2Id + '\'' +
                  ", date='"+ matchDate +'\''+
                '}';
    }
}