package soccer.hello.domain;

import lombok.Data;

@Data
public class Match {
    private int matchId;
    private int team1Id;
    private int team2Id;
    private String matchDate;

    @Override
    public String toString() {
        return "Match{" +
                "matchId=" + matchId +
                ", teamId='" + team1Id + '\'' +
                ", team2Id='" + team2Id + '\'' +
                  ", date='"+ matchDate +'\''+
                '}';
    }
}