package com.kyee.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 支付模块实体类
 * @author lyl
 * @version 1.0.0
 * @createTime 2021/11/16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private  long id;
    private String serial;
}
