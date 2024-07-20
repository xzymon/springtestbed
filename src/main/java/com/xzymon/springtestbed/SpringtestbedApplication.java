package com.xzymon.springtestbed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringtestbedApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringtestbedApplication.class, args);
	}

}
