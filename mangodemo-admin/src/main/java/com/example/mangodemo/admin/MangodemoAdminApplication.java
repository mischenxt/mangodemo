package com.example.mangodemo.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.mangodemo.admin.mapper")
@SpringBootApplication
public class MangodemoAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(MangodemoAdminApplication.class, args);
	}
}
