package com.zrd.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {
	@Autowired
	private HelloVO hello;

	@RequestMapping("hello")
	String hello(){
		return "hello:" + hello.getName() + hello.getPhone();
	}

	@RequestMapping("hh")
	String hh(Model model){
		return "hh";
	}

	public static void main(String[] args) {
		new SpringApplication(Application.class).run(args);
	}
}
