package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.base.ResultData;
import com.example.domain.Order;
import org.springframework.stereotype.Service;

/**
* @author bujiatang
* @description 针对表【order】的数据库操作Service
* @createDate 2025-03-26 10:11:40
*/
@Service
public interface OrderService extends IService<Order> {

    /**
     * 根据订单编号查询订单
     */
    ResultData<String> selectByNo(String orderNo);

    void addOrder(String productNo);

}