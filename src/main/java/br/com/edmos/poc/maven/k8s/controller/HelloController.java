package br.com.edmos.poc.maven.k8s.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloController {
	
	@Autowired
	public HelloController() {
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	
}
