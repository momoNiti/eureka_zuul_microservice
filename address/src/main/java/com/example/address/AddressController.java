package com.example.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping(value = "student")
public class AddressController {
	private final RestTemplate restTemplate;

    @Autowired
    public AddressController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/address")
    public Student getStudentAddress(@RequestParam(value = "email") final String email) {
        Student student = new Student();
        student.setEmail(email);
        
        student.setAddress("123 Dokkhamtai Phayao");
        return student;
    }
}
