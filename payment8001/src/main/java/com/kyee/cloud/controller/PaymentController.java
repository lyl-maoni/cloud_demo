package com.kyee.cloud.controller;

import com.kyee.cloud.entities.CommonResult;
import com.kyee.cloud.entities.Payment;
import com.kyee.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lyl
 * @version 1.0.0
 * @createTime 2021/11/16
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    PaymentService paymentService;
    /*插入*/
    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int  result = paymentService.create(payment);
        log.info("---插入结果："+result);
        if (result>0){
            return new CommonResult(1,"插入成功",result);
        }else {
            return new CommonResult(0,"插入失败",null);
        }

    }
    /*查询*/
    @PostMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id")  Long id){
        Payment payment = paymentService.getPaymentByID(id);
        log.info("---查询结果："+payment);
        if (payment != null){
            return new CommonResult(1,"查询成功",payment);
        }else {
            return new CommonResult(0,"没有该id",null);
        }

    }
}
