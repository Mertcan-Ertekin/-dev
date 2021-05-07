package Entities.concretes;

import Entities.abstracts.Entity;

public class User implements Entity{
	private int Id;
	private String FirstName;
	private String LastName;
	private String gMail;
	private String password;
	private boolean verification;
	
	public User() {
		
	}

	public User(int id, String firstName, String lastName, String gMail, String password) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		this.gMail = gMail;
		this.password = password;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getgMail() {
		return gMail;
	}

	public void setgMail(String gMail) {
		this.gMail = gMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isVerification() {
		return verification;
	}

	public void setVerification(boolean verification) {
		this.verification = verification;
	}

}
