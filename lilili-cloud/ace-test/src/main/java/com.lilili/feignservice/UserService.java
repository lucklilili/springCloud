package com.lilili.feignservice;

import com.lilili.feigndao.UserFeignDao;
import com.lilili.feignentity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserFeignDao userFeignDao;

    public UserEntity selectUser(String id){

        return userFeignDao.getUser(id);
    }
}
