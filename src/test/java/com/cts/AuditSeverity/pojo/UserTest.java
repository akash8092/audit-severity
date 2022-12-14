package com.cts.AuditSeverity.pojo;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;

import lombok.extern.slf4j.Slf4j;

/**

 * 			This class is used to hold the login credentials which will be sent
 *          by the user in the request body for getting the token
 *
 */

@ContextConfiguration @Slf4j
@SpringBootTest
public class UserTest {

	User loginCredential = new User();
	/**
	 * to test the all param constructor of UserLoginCredential
	 */
	
	@Test
	public void testUserLoginCredentialAllConstructor() {
		log.info("start");
		User credential = new User("abc", "abc");
		assertEquals(credential.getUserId(), "abc");
		log.info("end");
	}
	/**
	 * to test the getter setter of Uid
	 */
	@Test
	public void testGetUid() {
		log.info("start");
		loginCredential.setUserId("abc");
		assertEquals(loginCredential.getUserId(), "abc");
		log.info("end");
	}
	/**
	 * to test the getter setter of Password
	 */
	@Test
	public void testUserPassword() {
		log.info("start");
		loginCredential.setPassword("abc");
		assertEquals(loginCredential.getPassword(), "abc");
		log.info("end");
	}
	/**
	 * to test the getter setter of toString()
	 */
	@Test
	public void testoString() {
		log.info("start");
		String string = loginCredential.toString();
		assertEquals(loginCredential.toString(), string);
		log.info("end");
	}

}
