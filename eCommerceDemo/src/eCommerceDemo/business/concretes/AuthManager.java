package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.AuthService;
import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.entities.concretes.User;

public class AuthManager implements AuthService {
	
	UserService userService;

	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void Register(int id, String firstName, String lastName, String eMail, String password) {
		
		User user = new User(id, firstName, lastName, eMail, password);
		userService.add(user);
		
	}

	@Override
	public void Login(String eMail, String password) {
		
		if (userService.getByMail(eMail) == null) {
			System.out.println("Kullanýcý bulunamadý.");
			return;
		}
		else if (userService.getByMail(eMail).getPassword() != password) {
			System.out.println("Yanlýþ parola.");
			return;
		}
		System.out.println("Giriþ baþarýlý.");
		
	}



}
