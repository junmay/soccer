package soccer.hello.domain;

import lombok.Data;

@Data
public class Match {
    private int matchId;
    private int team1Id;
    private int team2Id;
    private String matchDate;

    public Match(int matchId, int team1Id, int team2Id, String matchDate) {
        this.matchId = matchId;
        this.team1Id = team1Id;
        this.team2Id = team2Id;
        this.matchDate = matchDate;
    }

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