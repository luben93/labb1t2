package DB;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class User {
	private String mail;
	private String hashpassword;
	private int userId;
	private boolean isLoggedIn;

	public User(int userId, String mail, String hashpassword) {
		this.mail = mail;
		this.setUserId(userId);
		this.hashpassword = hashpassword;
		isLoggedIn = false;
	}
	public User( String mail, String hashpassword) {
		this.mail = mail;
		this.setUserId(0);
		this.hashpassword = hashpassword;
		isLoggedIn = false;
	}

	public String getMail() {
		return mail;
	}
	
	public boolean isLoggedIn(){
		return isLoggedIn;
	}

	public boolean correctPassword(String enteredhashedpass) {
		if (enteredhashedpass.equals(new String(hashpassword))) {
			isLoggedIn = true;
		}
		
		if (isLoggedIn) {
			return true;
		} else {
			return false;
		}
	}

	public static String hasher(String pass) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(pass.getBytes("UTF-8")); // Change this to "UTF-16" if needed
		return new String(md.digest());
	}


	public String toString() {
		return "User:\n" + mail + "\n" + userId + "\n" + hashCode();
	}

	public int getUserId() {
		return userId;
	}

	private void setUserId(int userId) {
		this.userId = userId;
	}
}
