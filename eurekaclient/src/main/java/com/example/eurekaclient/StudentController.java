package com.example.eurekaclient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "student")
public class StudentController {
	private final RestTemplate restTemplate;

	@Autowired
    public StudentController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

	@GetMapping("/search")
	public Student getCustomer(@RequestParam(value = "email") final String email) {
		String url = "http://ADDRESS-SERVICE/student/address?email=" + email;
		return restTemplate.getForObject(url, Student.class);
	}
	@GetMapping("/")
	public String hello() {
		return ("Hello this is Client");
		}
}

