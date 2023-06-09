package soccer.hello.login.MemberRepository;

import lombok.Data;


@Data
public class MemberSearchCond {

    private String memberId;
    private String memberPassword;
    public MemberSearchCond() {
    }

    public MemberSearchCond(String memberId, String mmemberPassword) {
        this.memberId = memberId;
        this.memberPassword = memberPassword;
    }
}




