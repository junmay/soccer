package soccer.hello.login;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

//    private final MemberRepository memberRepository;

    /**
     * @return null 로그인 실패
     */
    public Member login(String loginId, String password) {
        return memberRepository.findByLoginId(loginId)
                // password 와 일치하면 해당 객체를 반환
                .filter(m -> m.getPassword().equals(password))
                // password 와 일치하지 않으면 null 을 반환
                .orElse(null);
    }
}
