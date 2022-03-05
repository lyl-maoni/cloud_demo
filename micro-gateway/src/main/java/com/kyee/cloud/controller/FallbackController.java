package com.kyee.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lyl
 * @version 1.0.0
 * @createTime 2021/11/18
 */
@RestController
public class FallbackController {

    @RequestMapping("/defaultFallback")
    public Map defaultFallback() {
        Map map = new HashMap<>();
        map.put("code", 1);
        map.put("message", "服务负载过大，已进行降级处理，请稍后尝试！");
        return map;
    }
}
