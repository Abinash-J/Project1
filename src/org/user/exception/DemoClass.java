package org.user.exception;

public class DemoClass {

	public static void main(String[] args) throws UserDefinedException {
		int a = 10;
		int b = a+6;
		
		if (b>18) {
			throw new UserDefinedException();
		}
		else {
			System.out.println("Age is greater than 18");
		}
		System.out.println("Modified Data");
	}	
	
}
