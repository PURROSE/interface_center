package com.purplerosechen.ic.gateway_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author chen
 * @version 1.0
 * @description: TODO 启动网关服务
 * @date 2023/12/18 15:03
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.purplerosechen.ic"})
@EnableDiscoveryClient
public class StartGateWayServerMain {
    public static void main(String[] args) {
        SpringApplication.run(StartGateWayServerMain.class, args);
    }
}
