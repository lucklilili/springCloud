package com.eureka;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaBootstrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaBootstrap.class).web(true).run(args);
    }


}
