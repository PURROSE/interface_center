package com.purplerosechen.ic.login_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author chen
 * @version 1.0
 * @description: TODO 登录服务启动类
 * @date 2023/12/18 15:21
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.purplerosechen.ic"})
@EnableDiscoveryClient
public class StartLoginServerMain {
    public static void main(String[] args) {
        SpringApplication.run(StartLoginServerMain.class, args);
    }
}
