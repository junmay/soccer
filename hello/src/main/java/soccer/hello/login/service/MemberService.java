package soccer.hello.login.service;
import soccer.hello.domain.Member;
import java.util.Optional;


public interface MemberService {

    Member save(Member member);

    Member findById(String id);

    Member login(String id, String password);

}
