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
			System.out.println("Kullanıcı doğrulandı /n Başarılı bir şekilde"
					+ " eklendi.");
		}
		else {
			System.out.println("Kullanıcı doğrulanamadı/nBu birey bulunmamaktadır.");
		}
		
		
	}

	@Override
	public void userDelete(User user) {
		System.out.println("Kullanıcı silindi !! "+ user.getFirstName());
		
	}

	@Override
	public void userUpdate(User user) {
		System.out.println("Kullanıcı güncellendi !! " + user.getFirstName() );
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
