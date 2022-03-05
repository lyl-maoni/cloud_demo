package com.kyee.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author lyl
 * @version 1.0.0
 * @createTime 2021/11/18
 */

@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@EnableFeignClients
@EnableTransactionManagement
public class MicroGatewayApplication {
    public static void main(String[] args) {
        // 启动micro-gateway
        SpringApplication.run(MicroGatewayApplication.class,args);
    }
}
