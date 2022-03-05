package com.kyee.cloud.mapper;

import com.kyee.cloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author lyl
 * @version 1.0.0
 * @createTime 2021/11/16
 */
@Mapper
public interface PaymentDao {
    /*写操作*/
    int create(Payment payment);

    /*读操作*/
    Payment getPaymentByID(@Param("id") Long id);

}
