package com.kyee.cloud.constant;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author lyl
 * @version 1.0.0
 * @createTime 2021/11/18
 */
public class Constant {

    /**
     *     配置中心地址
     */
    @Value("${pacs.integrateCenter.url}")
    public String pacsUrl;
}
