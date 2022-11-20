package com.codeo.mp.entity;

public class UserData {

	String id =null;
      String uName= null;
	  String uMobileno = null;
	  String uAddress = null;
	  String uEmail = null;
	  String uPassword = null;
	  
	public UserData(String uName, String uMobileno, String uAddress, String uEmail, String uPassword) {
		super();
		this.uName = uName;
		this.uMobileno = uMobileno;
		this.uAddress = uAddress;
		this.uEmail = uEmail;
		this.uPassword = uPassword;
	}
	 
	public UserData(String id, String uName, String uMobileno, String uAddress, String uEmail, String uPassword) {
		super();
		this.id = id;
		this.uName = uName;
		this.uMobileno = uMobileno;
		this.uAddress = uAddress;
		this.uEmail = uEmail;
		this.uPassword = uPassword;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuMobileno() {
		return uMobileno;
	}

	public void setuMobileno(String uMobileno) {
		this.uMobileno = uMobileno;
	}

	public String getuAddress() {
		return uAddress;
	}

	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}

	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	@Override
	public String toString() {
		return "UserData [id=" + id + ", uName=" + uName + ", uMobileno=" + uMobileno + ", uAddress=" + uAddress
				+ ", uEmail=" + uEmail + ", uPassword=" + uPassword + "]";
	}
	
	
	
	  
	
}
