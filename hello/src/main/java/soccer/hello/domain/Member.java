package soccer.hello.domain;

import lombok.Data;
import jakarta.validation.constraints.NotEmpty;



@Data
public class Member {

//    private int memberNumber;
    @NotEmpty
    private String memberId;
    @NotEmpty
    private String memberPassword;


}
