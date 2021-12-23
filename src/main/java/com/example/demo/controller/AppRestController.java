package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DemoData;
import com.example.demo.service.DemoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/mytest")
public class AppRestController {

	private final DemoService demoService;
	
	@GetMapping("/names")
	public ResponseEntity<List<DemoData>> getNames(){

		return ResponseEntity.ok(demoService.listAll());
		
	}
	
//	@PostMapping("/add/{name}")
//	public ResponseEntity<List<DemoData>> insertNames(@PathVariable("name") String value){
//		
//		return ResponseEntity.ok(demoService.insertName(value));
//		
//	}
	
	@PostMapping("/add")
	public ResponseEntity<DemoData> insertNames(@RequestParam("name") String value){
		
		demoService.insertName(value);
		
		System.out.println("this is value");
		System.out.println("");
		System.out.println(value);
		
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
}
