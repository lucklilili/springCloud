package com.user.service;

import com.user.dao.UserDao;
import com.user.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public UserEntity selectUser(String id){

        return userDao.getById(id);
    }
}
