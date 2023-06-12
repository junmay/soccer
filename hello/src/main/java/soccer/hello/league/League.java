package soccer.hello.league;


import lombok.Data;

@Data
public class League {
    private int leagueId;
    private String leagueName;
    private String leagueLocation;



    @Override
    public String toString() {
        return "League{" +
                "leagueId=" + leagueId +
                ", leagueName='" + leagueName + '\'' +
                ", leagueLocation='" + leagueLocation + '\'' +
                '}';
    }
}
