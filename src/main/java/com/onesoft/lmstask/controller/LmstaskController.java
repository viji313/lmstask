package com.onesoft.lmstask.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LmstaskController {
	@GetMapping("value=/fetched")
	public String pullData() {
		return "hai all";
		
	}

}
