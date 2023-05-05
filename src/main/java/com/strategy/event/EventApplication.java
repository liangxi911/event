package com.strategy.event;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventApplication {
	
	private static Logger log = Logger.getLogger(EventApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(EventApplication.class, args);
		log.info("12312323123");
	}
}
