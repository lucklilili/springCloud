package com.lilili.feigndao;

import com.lilili.feignentity.UserEntity;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "ace-user", fallback = UserFeignFallback.class)
//@FeignClient("ace-user") 开发期间使用
public interface UserFeignDao {

    @RequestMapping(method = RequestMethod.GET, value="/getUser/{id}")
    UserEntity getUser(@PathVariable("id") String id);
}
