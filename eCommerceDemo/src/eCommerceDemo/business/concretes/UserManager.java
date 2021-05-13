package eCommerceDemo.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;

	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		
		if (checkIfEmailExists(user.geteMail())) {
			if (checkPasswordLength(user.getPassword())) {
				if (checkNameLength(user.getFirstName(),user.getLastName())) {
					if (checkEmailPattern(user.geteMail())) {

						sendMail(user.geteMail());
						user.setChecked(true);
						isUserChecked(user);
						userDao.add(user);
						return;
						
					}
				}
			}			
		}
		
		System.out.println("Kullanýcý eklenemedi.");
		return;
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public User getByMail(String eMail) {
		return userDao.getByMail(eMail);
	}
	
	private boolean checkIfEmailExists(String eMail) {
		return true;
	}
	
	private boolean checkEmailPattern(String eMail) {
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		
		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(eMail);
		
		if (matcher.matches() != true) {
			System.out.println("Lütfen geçerli bir e-posta adresi giriniz.");
			return false;
		}
		
		return true;
		
	}
	
	private boolean checkPasswordLength(String password) {
		if (password.length()>=6) {
			return true;
		}

		System.out.println("Parolanýz en az 6 karakter olmalýdýr.");
		return false;

	}
	
	private boolean checkNameLength(String firstName, String lastName) {
		if (firstName.length() >= 2 && lastName.length() >= 2) {
			return true;
		}
		
		System.out.println("Ad-Soyad en az 2 karakter olmalýdýr.");
		return false;
	}
	
	private void sendMail(String eMail) {
		System.out.println("Doðrulama e-postasý gönderildi.");
	}
	
	private boolean isUserChecked(User user) {
		if (!user.isChecked()) {
			System.out.println("Kullanýcý doðrulanamadý.");
			return false;
		}
		//System.out.println("Kullanýcý eklendi: " + user.getFirstName() + " " + user.getLastName());
		return true;
	}

	
}
