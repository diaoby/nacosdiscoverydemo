package com.huaxin.microservice.service2.service;

import com.huaxin.microservice.service2.api.ProviderService;

/**
 * @author ：diaoby
 * @date ：Created in 2021/6/3 15:50
 * @description：ProviderService的实现
 * @modified By：
 */
@org.apache.dubbo.config.annotation.Service
public class ProviderServiceImpl implements ProviderService {
    /**
     *
     * @return
     */
    public String service() {
        return "ProviderService.service";
    }
}
