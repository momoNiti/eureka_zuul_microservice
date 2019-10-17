package com.example.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}	

//	@Component
//	@RestController
//	public class ServiceDiscoveryClient {
//		@Autowired
//		private DiscoveryClient discoveryClient;
//		
//		public Student getStudent(String studentId) {
//			RestTemplate restTemplate = new RestTemplate();
//			List<ServiceInstance> instances = discoveryClient.getInstances("studentservice");
//			String serviceUri = String.format("%s/v1/student/%s", instances.get(0).getUri().toString(), studentId);
//			ResponseEntity<Student> restExchange = restTemplate.exchange(serviceUri, HttpMethod.GET, null,
//					Student.class, studentId);
//			return restExchange.getBody();
//		}
//	}

}
