package com.shorturl;

import com.shorturl.url.model.Const;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class ShorturlApplication {

	public static void main(String[] args) {
//		if(Const.BACKWARD.name().equalsIgnoreCase("backward"))
//			System.out.println("hello");


		SpringApplication.run(ShorturlApplication.class, args);
	}

}
