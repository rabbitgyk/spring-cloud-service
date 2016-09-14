package com.rabbit.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compute")
public class ComputeController {
	
	Logger log = LoggerFactory.getLogger(ComputeController.class);
	
	@RequestMapping("/plus")
	public int plus(int a, int b){
		log.info("计算服务中的加法接口，请求参数，a:{}, b：{}", a, b);
		return a + b;
	}
	
	@RequestMapping("/name")
	public String addPre(String name){
		log.info("计算服务中的名字接口，请求参数，name:{}", name);
		return "my name is " + name;
	}

}
