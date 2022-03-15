package com.bhavna.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class MicroServicesEmployeeClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesEmployeeClientApplication.class, args);
	}

}
