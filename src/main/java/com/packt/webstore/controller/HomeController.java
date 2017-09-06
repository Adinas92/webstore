package com.packt.webstore.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String welcome(Model model)
	{
		model.addAttribute("greeting", "Witaj w sklepie internetowym");
		model.addAttribute("tagline", "Wyjątkowym i jedynym sklepie");
		
		return "welcome";
	}
	@RequestMapping ("/welcome/greeting")
	public String greeting() {
		return "welcome";
	}
}
