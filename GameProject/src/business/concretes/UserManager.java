package business.concretes;

import java.util.List;


import business.abstracts.UserCheckService;
import business.abstracts.UserService;
import entities.User;

public class UserManager implements UserService{

	private UserCheckService userCheckService;


	@Override
	public void userAdd(User user) {
		if(userCheckService.checkIfRealPerson(user))
		{
			System.out.println("Kullan�c� do�ruland� /n Ba�ar�l� bir �ekilde"
					+ " eklendi.");
		}
		else {
			System.out.println("Kullan�c� do�rulanamad�/nBu birey bulunmamaktad�r.");
		}
		
		
	}

	@Override
	public void userDelete(User user) {
		System.out.println("Kullan�c� silindi !! "+ user.getFirstName());
		
	}

	@Override
	public void userUpdate(User user) {
		System.out.println("Kullan�c� g�ncellendi !! " + user.getFirstName() );
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
