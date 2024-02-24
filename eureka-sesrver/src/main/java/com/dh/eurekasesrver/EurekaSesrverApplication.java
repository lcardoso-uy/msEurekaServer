package com.dh.eurekasesrver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaSesrverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaSesrverApplication.class, args);
	}

}
