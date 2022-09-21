package User;

import java.io.Serializable;

public class User implements Serializable{
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private boolean isLogged;

	
	public User(String first, String last, String email, String password) {
		firstName = first;
		lastName = last;
		this.email = email;
		this.password = password;
		isLogged = false;
	}
	
	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public boolean checkPassword(String password) {
		return password.equals(getPassword());
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public boolean isLogged() {
		return isLogged;
	}

	public void setLogged(boolean isLogged) {
		this.isLogged = isLogged;
	}

}
