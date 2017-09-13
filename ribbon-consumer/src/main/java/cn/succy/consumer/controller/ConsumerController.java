package cn.succy.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by succy on 17-9-12.
 */
@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/helloConsumer")
    public Object helloConsumer() {
        return restTemplate.getForObject("http://eureka-client/hello", String.class);
    }
}
