package eCommerceDemo.business.abstracts;

public interface AuthService {
		
	public void Register(int id, String firstName, String lastName, String eMail, String password);
	public void Login(String eMail, String password);
}
