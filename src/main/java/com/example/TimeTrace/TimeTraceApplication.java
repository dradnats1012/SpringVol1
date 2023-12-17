package com.example.TimeTrace;

import aop.TimeTraceAop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAspectJAutoProxy
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class TimeTraceApplication {

	@GetMapping("/")
	String home() {
		return "Hello World!@@!";
	}

	public static void main(String[] args) {
		SpringApplication.run(TimeTraceApplication.class, args);
	}

}
