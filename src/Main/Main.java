package Main;

import java.util.Optional;

import javax.security.auth.login.FailedLoginException;

public class Main {

	public static void main(String[] args) {
		
		// 0번 Id를 가진 회원검색을 실패했다고 가정
		Optional<User> findUser = new User().findUserById(0);
		
		findUser.orElseThrow(
				() -> new FailFinduserid("회원 검색을 실패했습니다")
		);
	}

}
