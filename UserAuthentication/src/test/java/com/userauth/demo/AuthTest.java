package com.userauth.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.userauth.demo.AuthenticationUser;

class AuthTest {

private AuthenticationUser authU;
	
	@BeforeEach
	public void setup() {
		authU= new AuthenticationUser();
		System.out.println("Authentication User main class inititated");
	}
	
	@AfterEach
	public void tearDown() {
		authU=null;
		System.out.println("Class Closed");
	}
	
	@Test
	public void checkUser() {
		assertEquals("admin123@gmail.com", authU.username());
	}
	@Test
	public void checkUserNull()
	{
		assertNotNull(authU.username());
	}
	
	@Test
	public void checkPass() {
		assertEquals("admin123", authU.paswd());
	}
	
	@Test
	public void checkPassNull()
	{
		assertNotNull(authU.paswd());
	}
	
	@Test
	public void checkUserRegx()
	{
		String email = authU.username();
		String regex = "^(.+)@(.+)$";
		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		
		
		assertEquals(true, matcher.matches());
	}

}
