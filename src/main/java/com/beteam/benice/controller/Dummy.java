package com.beteam.benice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dummy {
	@GetMapping("/")
	@ResponseBody
	public ResponseEntity<String>  getHello() {
		return ResponseEntity.ok().body("Hol mundo");
	}
}
