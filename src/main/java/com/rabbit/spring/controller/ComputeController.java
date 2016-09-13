package com.rabbit.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compute")
public class ComputeController {
	
	@RequestMapping("/plus")
	public int plus(int a, int b){
		return a + b;
	}

}
