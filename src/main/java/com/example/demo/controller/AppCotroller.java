package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.model.DemoData;
import com.example.demo.service.DemoService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class AppCotroller {
	
	private final DemoService demoService;
	
	@GetMapping("/")
	public String index (Model model) {
		
		List<DemoData> myString = demoService.listAll();
		//String myString = "hi";
		model.addAttribute("text", myString);
		
		return "Index";
	
	};
}
