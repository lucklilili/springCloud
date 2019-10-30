package com.user;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.user.dao")
public class UserBootstrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder(UserBootstrap.class).web(true).run(args);
    }


}
