package com.purplerosechen.ic.login_server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * @author chen
 * @version 1.0
 * @description: TODO 登录接口API
 * @date 2023/12/18 16:57
 */

@RestController
@RequestMapping("/login")
public class LoginController {

    Logger logger = Logger.getLogger("LoginController");
    @RequestMapping("/login")
    public String login(){
        logger.info("logger info!");
        return "login";
    }
}
