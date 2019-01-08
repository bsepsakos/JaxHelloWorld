package com.jws.JaxHelloWorld;

import javax.jws.WebService;

@WebService
public class JaxHelloWorld {
	
	public void Constructor() {
		 
	}
	
	public String Hello(String s) {
		return "Hello "+ s;
	}
	
	public Integer FibonacciRecursive(int n) throws NegativeNumberException {
		
		/* Throw Exception if invalid Arguments */
		if (n<0) {
			throw new NegativeNumberException("Negative Numbers are Invalid");
		}
		
		
		if ((n==1) || (n==0) ) {
			return 1;
		}
		
		/* Recursive Call */
		return FibonacciRecursive(n-1) + FibonacciRecursive(n-2) ;
	}
	
public Integer Fibonacci(int n) throws NegativeNumberException {
		
		/* Throw Exception if invalid Arguments */
		if (n<0) {
			throw new NegativeNumberException("Negative Numbers are Invalid");
		}
		
		int a=1;
		int b=1;
		
		for (int i=1; i<n;i++) {
			int tmp = a+b;
			a=b;
			b=tmp;
		}
		
		return b;
	}

}
