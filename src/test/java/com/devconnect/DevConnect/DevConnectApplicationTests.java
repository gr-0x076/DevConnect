package com.devconnect.DevConnect;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class DevConnectApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
	}

	@Test
	void healthEndpointReturnsUp() throws Exception {
		mockMvc.perform(get("/health"))
				.andExpect(status().isOk())
				.andExpect(content().json("{\"status\":\"Health check is successful\"}"));
	}

	@Test
	void developersEndpointReturnsDevelopers() throws Exception {
		mockMvc.perform(get("/developers"))
				.andExpect(status().isOk())
				.andExpect(content().json("{\"status\":\"Developers data retrieved successfully\"}"))
				.andExpect(jsonPath("$.developers").isArray())
				.andExpect(jsonPath("$.developers[0].name").value("Mohith GR"));
	}

	@Test
	void homePageIsServed() throws Exception {
		mockMvc.perform(get("/index.html"))
				.andExpect(status().isOk())
				.andExpect(content().contentTypeCompatibleWith("text/html"))
				.andExpect(content().string(org.hamcrest.Matchers.containsString("Check backend")))
				.andExpect(content().string(org.hamcrest.Matchers.containsString("Fetch developers")));
	}

}
