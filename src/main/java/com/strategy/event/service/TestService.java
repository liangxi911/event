package com.strategy.event.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.strategy.event.dao.TestDao;

@Service
public class TestService {
	@Autowired
	private TestDao ed;
	
	public void getT() {
		String aa = ed.getDataCount();
		System.out.println(aa);
	}
	
}
