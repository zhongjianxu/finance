package com.zjx.finance.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zjx.finance.entity.MyProperties;
import com.zjx.finance.entity.MyProperties2;


@RequestMapping("/properties")
@RestController
public class PropertiesController {

	 private static final Logger log = LoggerFactory.getLogger(PropertiesController.class);

	    private final MyProperties myProperties;
	    private final MyProperties2 myProperties2;
	    @Autowired
	    public PropertiesController(MyProperties myProperties,MyProperties2 myProperties2) {
	        this.myProperties = myProperties;
	        this.myProperties2=myProperties2;
	    }

	    @GetMapping("/1")
	    public MyProperties myProperties() {
	        log.info("=================================================================================================");
	        log.info(myProperties.toString());
	        log.info("=================================================================================================");
	        return myProperties;
	    }
	    
	    @GetMapping("/2")
	    public MyProperties2 myProperties2() {
	        log.info("=================================================================================================");
	        log.info(myProperties2.toString());
	        log.info("=================================================================================================");
	        return myProperties2;
	    }
}
