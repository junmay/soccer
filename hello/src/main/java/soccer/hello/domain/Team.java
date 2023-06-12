package soccer.hello.domain;

import lombok.Data;

@Data
public class Team {

    private String teamId;
    private String teamName;
    private String league;

    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId +
                ", teamName='" + teamName + '\'' +
                ", league='" + league + '\'' +
                '}';
}
}
