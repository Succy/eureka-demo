package cn.succy.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "cn.succy.client")// FeignClient是打包成jar的，因此要指定basePackages
@EnableDiscoveryClient
public class EurekaFeignConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignConsumerApplication.class, args);
    }
}
