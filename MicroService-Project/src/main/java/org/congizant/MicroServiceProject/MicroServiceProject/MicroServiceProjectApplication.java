package org.congizant.MicroServiceProject.MicroServiceProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroServiceProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceProjectApplication.class, args);
		System.out.println("Welcome folks... My name is controller"  + 
		"And I received a request");
	}

}
