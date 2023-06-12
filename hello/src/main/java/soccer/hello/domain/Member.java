package soccer.hello.domain;

import lombok.Data;
import jakarta.validation.constraints.NotEmpty;
import lombok.extern.slf4j.Slf4j;


@Data
@Slf4j
public class Member {

//    private int memberNumber;
//    @NotEmpty
    private String memberId;
//    @NotEmpty
    private String memberPassword;

    public Member() {
        log.info("Member] memberId = " + memberId+"기본 생성자 실행");
    }

    public Member(String memberId, String memberPassword) {
        this.memberId = memberId;
        this.memberPassword = memberPassword;
        log.info("Member] memberId = " + memberId + "매개변수가 2개인 생성자 실행");
    }
}
