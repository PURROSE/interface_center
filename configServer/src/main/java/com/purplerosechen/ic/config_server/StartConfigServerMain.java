package com.purplerosechen.ic.config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author chen
 * @version 1.0
 * @description: TODO 服务配置中心启动类
 * @date 2023/12/18 1:31
 */

@SpringBootApplication
@EnableConfigServer
@ComponentScan(basePackages = {"com.purplerosechen.ic"})
public class StartConfigServerMain {
    public static void main(String[] args) {
        SpringApplication.run(StartConfigServerMain.class, args);
    }
}
