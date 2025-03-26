package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.service.OrderService;
import domain.Order;
import com.example.mapper.OrderMapper;
import org.springframework.stereotype.Service;

/**
* @author bujiatang
* @description 针对表【order】的数据库操作Service实现
* @createDate 2025-03-26 10:11:40
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService {

}




