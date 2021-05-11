package business.abstracts;

import java.util.List;

import entities.User;

public interface UserService {
	
	void userAdd(User user);
	void userDelete(User user);
	void userUpdate(User user);
	public List<User> getAll();

}
