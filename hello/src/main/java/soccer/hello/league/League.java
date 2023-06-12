package soccer.hello.league;

public class League {
    private int leagueId;
    private String leagueName;
    private String leagueLocation;

    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueLocation() {
        return leagueLocation;
    }

    public void setLeagueLocation(String leagueLocation) {
        this.leagueLocation = leagueLocation;
    }

    @Override
    public String toString() {
        return "League{" +
                "leagueId=" + leagueId +
                ", leagueName='" + leagueName + '\'' +
                ", leagueLocation='" + leagueLocation + '\'' +
                '}';
    }
}
