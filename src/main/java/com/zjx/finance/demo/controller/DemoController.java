package com.zjx.finance.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	@RequestMapping("/login")
	public String hello() {
		return "/login/login";
	}
	
}
