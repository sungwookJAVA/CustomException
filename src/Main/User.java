package Main;

import java.util.Optional;

public class User {
	private String user_id;
	private String name;
	
	/***
	 * Id��� ȸ���˻�
	 * @param id
	 * @return null: �Ϻη� ȸ���˻��� �����ߴٰ� ����
	 */
	public Optional<User> findUserById(int id) {
		 return Optional.empty();
	}
}
