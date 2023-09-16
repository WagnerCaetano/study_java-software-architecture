package br.com.wagnercaetano.diojavaspringdesignpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DioJavaSpringDesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioJavaSpringDesignPatternsApplication.class, args);
	}

}
