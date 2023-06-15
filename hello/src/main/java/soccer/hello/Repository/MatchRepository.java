package soccer.hello.Repository;

import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import soccer.hello.domain.League;
import soccer.hello.domain.Match;

import java.util.List;


public interface MatchRepository {

//    Member save(Member member);

//    Optional<Member> findById(String memberId);


    List<Match> getAllMatches();
    List<Match> arrayMatches();

}
