package soccer.hello.login;


import lombok.Data;

import jakarta.validation.constraints.NotEmpty;

// 로그인에 필요한 정보는 ID/Passwd 만 필요하므로 별도의 LoginForm을 생성한다.
@Data
public class LoginForm {
    @NotEmpty
    private String loginId;
    @NotEmpty
    private String password;
}
