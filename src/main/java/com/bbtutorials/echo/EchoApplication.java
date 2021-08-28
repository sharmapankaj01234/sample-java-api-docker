package com.bbtutorials.echo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class EchoApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(EchoApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port","8083"));
		System.setProperty("logging.level.org.springframework",args[0]);
		app.run(args);
	}

}
