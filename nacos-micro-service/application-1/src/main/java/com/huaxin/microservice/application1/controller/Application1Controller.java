package com.huaxin.microservice.application1.controller;

import com.huaxin.microservice.service1.api.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：diaoby
 * @date ：Created in 2021/6/3 14:08
 * @description：应用控制类  通过http提供外部api
 * @modified By：
 */
@RestController
public class Application1Controller {

    //注入service 基于dubbo协议
    @org.apache.dubbo.config.annotation.Reference//生产接口代理对象，通过代理对象进行远程调用
    private ConsumerService consumerService;


    @GetMapping("/service")
    public String service(){
        String service = consumerService.service();
        return "Application1Controller ->"+service;
    }
}
