package com.strategy.event;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.strategy.event.service.TestService;

@SpringBootTest
class EventApplicationTests {
	
	@Autowired
	private TestService ts;
	
	@Test
	void contextLoads() {
		ts.getT();
	}

}
