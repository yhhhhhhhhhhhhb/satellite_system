package com.satellite.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@MapperScan("com.satellite.system.mapper")
public class RunApplication {

	public static void main(String[] args) {
		SpringApplication.run(RunApplication.class, args);
	}
}
