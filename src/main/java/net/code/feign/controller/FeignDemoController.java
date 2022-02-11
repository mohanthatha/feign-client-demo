package net.code.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.code.feign.util.FeignServiceUtil;

@RestController
@RequestMapping("/demo")
public class FeignDemoController {
	
     @Autowired
	private FeignServiceUtil feignserviceutil;
     
     @GetMapping("/user-name")
     public String getUserName() {
    	return feignserviceutil.getName();
     }
     @GetMapping("/user-address")
     public String getUserAddress() {
    	return feignserviceutil.getAddress();
     }
     @GetMapping("/user-status")
     public String getUserStatus() {
    	return feignserviceutil.getStatus();
     }
}
		