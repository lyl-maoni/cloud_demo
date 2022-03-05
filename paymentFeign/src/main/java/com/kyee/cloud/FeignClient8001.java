package com.kyee.cloud;

import com.kyee.cloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author lyl
 * @version 1.0.0
 * @createTime 2021/11/17
 */
@FeignClient(name = "payment8001")
public interface FeignClient8001 {
    @PostMapping(value = {"/payment/get/{id}"}, consumes = {"application/json"})
    CommonResult getPaymentById(@PathVariable("id")  Long id);

}
