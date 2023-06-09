package soccer.hello.login.MemberRepository;

import soccer.hello.domain.Member;
import java.util.List;
import java.util.Optional;



public interface MemberRepository {

    Member save(Member member);

    Optional<Member> findById(String memberId);

    List<Member> findAll(MemberSearchCond cond);

}