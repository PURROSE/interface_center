package com.purplerosechen.ic.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author chen
 * @version 1.0
 * @description: TODO 服务注册中心启动类
 * @date 2023/12/18 9:19
 */

@SpringBootApplication
@EnableEurekaServer
public class StartEurekaServerMain {
    public static void main(String[] args) {
        SpringApplication.run(StartEurekaServerMain.class, args);
    }
}
