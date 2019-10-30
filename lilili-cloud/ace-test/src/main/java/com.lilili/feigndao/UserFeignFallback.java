package com.lilili.feigndao;

import com.lilili.feignentity.UserEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class UserFeignFallback implements UserFeignDao {


    @Override
    public UserEntity getUser(@PathVariable("id") String id) {
        UserEntity userEntity=new UserEntity();
        userEntity.setLoginName("断路");
        return userEntity;
    }
}
