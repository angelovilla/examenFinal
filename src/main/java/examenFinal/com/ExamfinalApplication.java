package examenFinal.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ExamfinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamfinalApplication.class, args);
	}

}
