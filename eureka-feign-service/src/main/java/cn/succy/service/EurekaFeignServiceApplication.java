package cn.succy.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaFeignServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaFeignServiceApplication.class, args);
	}
}
