package com.kyee.cloud.service.impl;

import com.kyee.cloud.entities.Payment;
import com.kyee.cloud.mapper.PaymentDao;
import com.kyee.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lyl
 * @version 1.0.0
 * @createTime 2021/11/16
 */
@Service
public class PaymentServiceImpl  implements PaymentService {

    //@Autowired   spring的
    @Resource   //java自带支持
     PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentByID(Long id) {
        return paymentDao.getPaymentByID(id);
    }
}
