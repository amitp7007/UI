package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class UiApplication {

	/*@GetMapping("/")
	  @ResponseBody
	  public String login() {
	    Map<String, Object> model = new HashMap<String, Object>();
	    model.put("id", 1234);
	    model.put("content", "Hello World");
	    return "login";
	  }*/
	@GetMapping("/resource")
	  @ResponseBody
	  public Map<String, Object> home() {
	    Map<String, Object> model = new HashMap<String, Object>();
	    model.put("id", 1234);
	    model.put("content", "Hello World");
	    return model;
	  }

	public static void main(String[] args) {
		SpringApplication.run(UiApplication.class, args);
	}
}
