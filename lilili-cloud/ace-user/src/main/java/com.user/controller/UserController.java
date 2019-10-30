package com.user.controller;

import com.user.entity.UserEntity;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@RestController
public class  UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
    public UserEntity getUser(@PathVariable("id") String id) {

        return userService.selectUser(id);
    }


}
