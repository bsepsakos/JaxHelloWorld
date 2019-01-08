package com.jws.JaxHelloWorld;

import javax.jws.WebService;

@WebService
public class JaxHelloWorld {
	
	public void Constructor() {
		 
	}
	
	public String Hello(String s) {
		return "Hello "+ s;
	}
	
	public Integer Fibonacci(int n) throws NegativeNumberException {
		
		/* Throw Exception if invalid Arguments */
		if (n<0) {
			throw new NegativeNumberException("Negative Numbers are Invalid");
		}
		
		
		if ((n==1) || (n==0) ) {
			return 1;
		}
		
		/* Recursive Call */
		return Fibonacci(n-1) + Fibonacci(n-2) ;
	}

}
