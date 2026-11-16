package com.devconnect.DevConnect.controller;
import java.util.*;
import com.devconnect.DevConnect.dto.HealthResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
	
	@GetMapping("/health")
	public HealthResponse health() {
		System.out.println("Health check endpoint called");
		return new HealthResponse("Health check is successful");
	}
	
	@GetMapping("api/v1/status")
	public Map<String,Object> status(){
		Map<String,Object> map = new HashMap<>();
		map.put("status", "OK");
		map.put("message", "Service is running");
		map.put("timestamp", new Date());
		return map;
	}
}
