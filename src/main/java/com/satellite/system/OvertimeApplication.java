package com.satellite.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication()
@MapperScan("com.daojia.overtiom.mapper")
public class OvertimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(OvertimeApplication.class, args);
	}
}
