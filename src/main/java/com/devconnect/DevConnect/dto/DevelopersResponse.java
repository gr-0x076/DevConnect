package com.devconnect.DevConnect.dto;

import com.devconnect.DevConnect.model.Developer;
import java.util.List;

public record DevelopersResponse(String status, List<Developer> developers) {
	public DevelopersResponse(String status) {
		this(status, List.of());
	}
}
