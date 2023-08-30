package com.Onesoft.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController class SampleDevops {
	
	@GetMapping(value="/devops")
	public String getval()
	{
		return "Devops Project Depolyed using Jenkins ";
	}

}
