package cn.succy.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by succy on 17-9-13.
 */
public interface UserServiceApi {
    @GetMapping("/users/{id}")
    String getUserById(@PathVariable("id") String id);
}
