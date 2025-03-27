package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.api.AccountDTO;
import com.example.base.ResultData;
import com.example.service.AccountService;
import com.example.service.OrderService;
import com.example.domain.Order;
import com.example.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


/**
* @author bujiatang
* @description 针对表【order】的数据库操作Service实现
* @createDate 2025-03-26 10:11:40
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService {

    @Autowired
    private AccountService accountService;

    @Override
    public ResultData<String> selectByNo(String orderNo) {
        final AccountDTO accountDTO = AccountDTO.builder().id(12).accountName("张三").accountCode("123")
                .amount(new BigDecimal("1234")).build();

        return  accountService.insert(accountDTO);
    }
}




