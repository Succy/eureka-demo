package cn.succy.consumer.controller;

import cn.succy.client.UserServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by succy on 17-9-13.
 */
@RestController
public class ConsumerController {
    @Autowired
    private UserServiceClient userServiceClient;

    @GetMapping("/get")
    public String get() {
        System.out.println("--- [ hahha ] ---");
        String userById = userServiceClient.getUserById("12344");
        System.out.println(String.format("-- [%s] --", userById));
        return userById;
    }
}
