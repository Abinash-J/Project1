package org.user.exception;

public class UserDefinedException extends Exception{

	@Override
	public String getMessage() {
		
		String m = "Age is less than 18";
		return m;
	}
	
}
