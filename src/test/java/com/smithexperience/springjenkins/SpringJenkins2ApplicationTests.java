package com.smithexperience.springjenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkins2ApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkins2ApplicationTests.class);


	@Test
	public void contextLoads() {
		logger.info("Test is executing... ");
		logger.info("Test case executing second log statement... ");
		assertEquals(true, true);
	}

}
