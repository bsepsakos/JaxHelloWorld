package com.jws.JaxHelloWorld;

import javax.jws.WebService;

@WebService
public class JaxHelloWorld {
	
	public String Hello(String s) {
		return "Hello "+ s;
	}

}
