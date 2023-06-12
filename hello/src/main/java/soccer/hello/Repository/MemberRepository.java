package soccer.hello.Repository;

import soccer.hello.domain.Member;

import java.util.Optional;



public interface MemberRepository {

    Member save(Member member);

    Optional<Member> findById(String memberId);


}
