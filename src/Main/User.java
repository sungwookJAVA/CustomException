package Main;

import java.util.Optional;

public class User {
	private String user_id;
	private String name;
	
	/***
	 * Id기반 회원검색
	 * @param id
	 * @return null: 일부로 회원검색을 실패했다고 가정
	 */
	public Optional<User> findUserById(int id) {
		 return Optional.empty();
	}
}
