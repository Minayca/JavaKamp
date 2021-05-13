package eCommerceDemo;

import eCommerceDemo.business.abstracts.AuthService;
import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.concretes.AuthManager;
import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.dataAccess.concretes.GoogleUserDao;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new GoogleUserDao());
		AuthService authService = new AuthManager(userService);
		
		authService.Register(1, "Mina Ayça", "KANBERK", "minayca@kanberk.com", "123456");
		authService.Login("minayca@kanberk.com", "123456");
	}

}
