package com.huaxin.microservice.service1.service;

import com.huaxin.microservice.service1.api.ConsumerService;
import com.huaxin.microservice.service2.api.ProviderService;

/**
 * @author ：diaoby
 * @date ：Created in 2021/6/3 14:33
 * @description：ConsumerService的实现类
 * @modified By：
 */
//Service 是dubbo的主键不是spring的
@org.apache.dubbo.config.annotation.Service
public class ConsumerServiceImpl implements ConsumerService {
    //注入service
    @org.apache.dubbo.config.annotation.Reference
    private ProviderService providerService;
    /**
     *
     * @return
     */
    public String service() {
        String service = providerService.service();
        return "ConsumerService.service -> " + service;
    }
}
