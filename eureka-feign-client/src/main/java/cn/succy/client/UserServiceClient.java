package cn.succy.client;

import cn.succy.api.UserServiceApi;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;

/**
 * Created by succy on 17-9-13.
 */
@Service
@FeignClient("eureka-feign-service")
public interface UserServiceClient extends UserServiceApi {

}
