package com.example.aop;

import com.example.ioc.ApplicationContextProvider;
import com.example.ioc.Base64Encoder;
import com.example.ioc.Encoder;
import com.example.ioc.UrlEncoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Base64;

@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);

		System.out.println(Base64.getEncoder().encodeToString("jortier@gmail.com".getBytes()));
	}

}
