package com.example.Authentication;


import com.example.Authentication.entities.User;
import com.example.Authentication.repositories.UserRepository;
import com.example.Authentication.services.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class EntityTests {

	@Test
	public void getAndSetPassword() {
		User testUser = new User();
		
		testUser.setPassword("mypassword");
		assertEquals(testUser.getPassword(),"mypassword");
	}
	
	@Test
	public void getAndSetName() {
		User testUser = new User();
		
		testUser.setName("gokul");
		assertEquals(testUser.getName(),"gokul");
	}
	
	@Test
	public void getAndSetEmail() {
		User testUser = new User();
		
		testUser.setEmail("gokul123@gmail.com");
		assertEquals(testUser.getEmail(),"gokul123@gmail.com");
	}
	
	@Test
	public void checkToString() {
		User testUser = new User();
		
		assertNotNull(testUser.toString());
	}
	
	@Test
	public void checkConstructor() {
		User testUser = new User("gokul","gokul123@gmail.com","9876543210");
		
		User checkUser = new User();
		checkUser.setName("gokul");
		checkUser.setEmail("gokul123@gmail.com");
		checkUser.setPassword("9876543210");
		
		assertEquals(testUser.getName(), checkUser.getName());
		assertEquals(testUser.getEmail(), checkUser.getEmail());
		assertEquals(testUser.getPassword(), checkUser.getPassword());
	}
	
	@Test
	public void testDefaultConstructor() {
		User testUser = new User();
		
		assertNotNull(testUser);
	}
}
