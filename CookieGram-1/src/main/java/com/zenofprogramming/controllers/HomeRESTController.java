package com.zenofprogramming.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeRESTController {
	@GetMapping("/")
	public String home() {
		return "ordercookie.html";
	}
	
	@PostMapping ("/ordercookie")
	public String orderCookie (@RequestParam String customerName, @RequestParam String recipientName)
	{
		System.out.println (customerName +" "+ recipientName);
//		return "Hello";
		return "ordercookie.html";
	}
}