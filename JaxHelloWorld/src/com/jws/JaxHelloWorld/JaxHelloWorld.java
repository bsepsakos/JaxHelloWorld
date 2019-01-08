package com.jws.JaxHelloWorld;

import javax.jws.WebService;

@WebService
public class JaxHelloWorld {
	
	public void Constructor() {
		
	}
	
	public String Hello(String s) {
		return "Hello "+ s;
	}

}
