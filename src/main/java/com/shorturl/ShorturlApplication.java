package com.shorturl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShorturlApplication {

	public static void main(String[] args) {
//		if(Const.BACKWARD.name().equalsIgnoreCase("backward"))
//			System.out.println("hello");


		SpringApplication.run(ShorturlApplication.class, args);
	}

}
