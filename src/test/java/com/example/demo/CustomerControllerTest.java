package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.http.MediaType;

@WebMvcTest(CustomerController.class)
public class CustomerControllerTest {

    @Autowired
    private MockMvc mockMvc;

	/*
	 * @Test void testGetCustomer() throws Exception { // Perform a GET request
	 * MvcResult result = mockMvc.perform(get("/customer")
	 * .accept(MediaType.APPLICATION_JSON)) .andReturn();
	 * 
	 * // Verify the HTTP status
	 * assertThat(result.getResponse().getStatus()).isEqualTo(200);
	 * 
	 * // Verify the content String expectedJson =
	 * "{\"id\":1,\"name\":\"Anusha S\",\"email\":\"anusha@gmail.com\"}";
	 * assertThat(result.getResponse().getContentAsString()).isEqualTo(expectedJson)
	 * ; }
	 */

	private Object get(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
