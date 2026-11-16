package com.devconnect.DevConnect.controller;

import com.devconnect.DevConnect.dto.DevelopersResponse;
import com.devconnect.DevConnect.service.DeveloperService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeveloperController {

	private final DeveloperService developerService;

	public DeveloperController(DeveloperService developerService) {
		this.developerService = developerService;
	}

	@GetMapping("/developers")
	public DevelopersResponse developers() {
		System.out.println("Developers data retrieved successfully");
		return new DevelopersResponse("Developers data retrieved successfully", developerService.getAllDevelopers());
	}
}
