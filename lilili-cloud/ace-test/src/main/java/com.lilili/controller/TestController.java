package com.lilili.controller;


import com.lilili.feignentity.UserEntity;
import com.lilili.feignservice.UserService;
import feign.Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@RestController
public class  TestController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/test/{id}", method = RequestMethod.GET)
    public UserEntity test(@PathVariable("id") String id, HttpServletRequest request, HttpServletResponse response) {
        return userService.selectUser(id);
    }

}
