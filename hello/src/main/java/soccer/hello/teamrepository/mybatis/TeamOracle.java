package soccer.hello.teamrepository.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import soccer.hello.team.Team;

import java.io.IOException;
import java.util.List;

public class TeamOracle {
    public static void main(String[] args) throws IOException {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("TeamMapper.xml"));
        SqlSession session = sqlSessionFactory.openSession();
        try {
            TeamMapper teamMapper = session.getMapper(TeamMapper.class);
            List<Team> teams = teamMapper.getAllTeams();

            // 필요에 따라 검색된 팀을 처리합니다
            for (Team team : teams) {
                System.out.println("팀 ID: " + team.getTeamId());
                System.out.println("팀 이름: " + team.getTeamName());
                System.out.println("리그 ID: " + team.getLeagueId());
                System.out.println("--------------------------");
            }
        } finally {
            session.close();
        }

    }
}
