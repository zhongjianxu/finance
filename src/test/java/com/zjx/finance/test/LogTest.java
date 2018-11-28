package com.zjx.finance.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Test
	public void test1() {
		String name = "imooc";
		String password = "123456";
		logger.debug("debug...");
		logger.info("name: " + name + " ,password: " + password);
		logger.info("name: {}, password: {}", name, password);
		logger.error("error...");
		logger.warn("warn...");
	}
}
