package com.mvcapplication.validation;

public class checkLoginValidation {
	
	String mail = "ramiadel681@gmail.com";
	String password = "123456";
	boolean bol = false;
	
	public boolean checkValidation(String email, String pass) {
		
		if(email.equals(mail) && (pass.equals(password))) {
			bol = true;
		}
		
		return bol;

     }
	
}