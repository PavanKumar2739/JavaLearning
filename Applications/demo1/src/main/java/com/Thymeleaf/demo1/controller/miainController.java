package com.Thymeleaf.demo1.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class miainController {

	@GetMapping(value = "/")
	public String front(Model model) {
		System.out.println("Inside  front....");
		
		model.addAttribute("name","Pavan Kumar");
		model.addAttribute("currentDate",new Date());
		return "front";
	}
	
	@GetMapping("/iterator")
	public String itrator(Model model) {
		List<String> names = List.of("pavan","kumar","p1");
		model.addAttribute("names",names);
		return "Iterator";
	}
}
