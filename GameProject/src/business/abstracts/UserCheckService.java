package business.abstracts;

import entities.User;

public interface UserCheckService {
	
	public boolean checkIfRealPerson(User user);
}
