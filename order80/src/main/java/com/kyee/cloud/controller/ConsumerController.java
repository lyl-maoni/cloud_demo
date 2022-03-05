package com.kyee.cloud.controller;

import com.kyee.cloud.FeignClient8001;
import com.kyee.cloud.entities.CommonResult;
import com.kyee.cloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author lyl
 * @version 1.0.0
 * @createTime 2021/11/16
 */
@RestController
@Slf4j
public class ConsumerController {
    /**
     * 提供者的地址
     */
    public static final String PAYMENT_URL = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    @Autowired
    private FeignClient8001 feignClient8001;
    /**
     * 调用端的restTemplate插入
     * @param payment
     * @return
     */
    @GetMapping("/consumer/payment/create")
    public CommonResult create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);

    }

    /**
     * 调用端的restTemplate查询
     * @param id
     * @return
     */
    @GetMapping("/consumer/payment/get/{id}")

    public CommonResult getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }

    /**
     *  调用端的Feign接口查询
     */
    @PostMapping("/consumer/paymentfegin/get/{id}")
    public CommonResult getPaymentByFeign(@PathVariable("id") Long id){
        return feignClient8001.getPaymentById(id);
    }
}
