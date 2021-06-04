package com.huaxin.microservice.application1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：diaoby
 * @date ：Created in 2021/6/3 14:21
 * @description：application1启动类
 * @modified By：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Application1Bootstrap {
    public static void main(String[] args) {
        SpringApplication.run(Application1Bootstrap.class);
    }
}
