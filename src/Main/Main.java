package Main;

import java.util.Optional;

import javax.security.auth.login.FailedLoginException;

public class Main {

	public static void main(String[] args) {
		
		// 0�� Id�� ���� ȸ���˻��� �����ߴٰ� ����
		Optional<User> findUser = new User().findUserById(0);
		
		findUser.orElseThrow(
				() -> new FailFinduserid("ȸ�� �˻��� �����߽��ϴ�")
		);
	}

}
