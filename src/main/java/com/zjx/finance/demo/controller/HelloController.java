package com.zjx.finance.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/index")
	public String hello() {
		return "Hello World!";
	}
	@RequestMapping("/getMap")
	public Map<Object, Object> getMap() {
		Map<Object, Object> m = new HashMap<>();
		m.put(1, "a");
		m.put(2, "b");
		m.put(3, "c");
		return m;
	}
}
