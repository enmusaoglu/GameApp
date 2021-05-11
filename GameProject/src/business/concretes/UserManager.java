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
			System.out.println("Kullanýcý doðrulandý /n Baþarýlý bir þekilde"
					+ " eklendi.");
		}
		else {
			System.out.println("Kullanýcý doðrulanamadý/nBu birey bulunmamaktadýr.");
		}
		
		
	}

	@Override
	public void userDelete(User user) {
		System.out.println("Kullanýcý silindi !! "+ user.getFirstName());
		
	}

	@Override
	public void userUpdate(User user) {
		System.out.println("Kullanýcý güncellendi !! " + user.getFirstName() );
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
