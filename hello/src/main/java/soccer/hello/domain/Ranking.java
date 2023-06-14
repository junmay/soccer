package soccer.hello.domain;

import lombok.Data;

@Data
public class Ranking {

    private String result;
    private Integer point;
    private Integer totalScore;
    private Integer totalLosePoint;


//    @Override
//    public String toString() {
//        return "{" +
//                "teamId=" + teamId +
//                ", playerName='" + playerName + '\'' +
//                ", playerId='" + playerId + '\'' +
//                '}';
//    }
//}
}
