package com.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	
	@RequestMapping(value="/first",method = RequestMethod.GET)
	public String firstAPI() {
		return "First API";
	}
	
	@RequestMapping(value="/second",method = RequestMethod.POST)
	public String secondAPI() {
		return "Second API";
	}
	
	@RequestMapping(value="/third",method = RequestMethod.PUT)
	public String thirdAPI() {
		return "Third API";
	}
}
