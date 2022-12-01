package com.jiwon.membership;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public abstract class MembershipApplication {

	public static void main(String[] args) {
		SpringApplication.run(MembershipApplication.class, args);
	}
	

}
