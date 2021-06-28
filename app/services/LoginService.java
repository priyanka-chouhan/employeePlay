package services;

public class LoginService {

	public boolean authenticateUser(String username,String password) {
		if(username.equals("admin") && password.equals("12345")) {
			return true;
		}
		return false;
	}
	
}
