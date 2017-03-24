package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Author: masong
 * Date: 2017/3/24 17:13
 * Version: v1.0
 */
@RestController
@RefreshScope
public class MySampleRestController {
    @Value("${my-config.appName}")
    private String appName;

    @RequestMapping("/app-name")
    public String getAppName() {
        return appName;
    }
}