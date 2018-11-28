package com.zjx.finance.demo.controller;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DemoController {
	private static Logger logger = Logger.getLogger(DemoController.class); 
	@RequestMapping("/login")
	public String hello() {
		logger.info("message of login**************");
		return "/login/login";
	}  
}
