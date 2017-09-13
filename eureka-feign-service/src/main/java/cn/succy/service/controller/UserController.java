package cn.succy.service.controller;

import cn.succy.api.UserServiceApi;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by succy on 17-9-13.
 */
@RestController
public class UserController implements UserServiceApi {
    @Override
    public String getUserById(@PathVariable String id) {
        return "User id is: " + id;
    }
}
