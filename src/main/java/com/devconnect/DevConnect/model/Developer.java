package com.devconnect.DevConnect.model;

import java.util.List;

public class Developer {
	private Long id;
	private String name;
	private String role;
	private String email;
	private List<String> skills;
	private String bio;

	public Developer() {
	}

	public Developer(Long id, String name, String role, String email, List<String> skills, String bio) {
		this.id = id;
		this.name = name;
		this.role = role;
		this.email = email;
		this.skills = skills;
		this.bio = bio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}
}
