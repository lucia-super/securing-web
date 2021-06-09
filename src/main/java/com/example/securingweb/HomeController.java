package com.example.securingweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/hello")
	public String greeting() {
		return "hello";
	}

}