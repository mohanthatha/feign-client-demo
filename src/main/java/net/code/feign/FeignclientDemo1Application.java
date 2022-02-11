package net.code.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignclientDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(FeignclientDemo1Application.class, args);
	}

}
