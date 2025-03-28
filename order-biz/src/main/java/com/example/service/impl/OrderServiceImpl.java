package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.api.AccountClient;
import com.example.base.ResultData;
import com.example.domain.OrderDTO;
import com.example.service.OrderService;
import com.example.domain.Order;
import com.example.mapper.OrderMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Random;


/**
* @author bujiatang
* @description 针对表【order】的数据库操作Service实现
* @createDate 2025-03-26 10:11:40
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService {

    @Autowired
    private AccountClient accountClient;

    @Override
    public ResultData<String> selectByNo(String orderNo) {
        Random random = new Random();
//        // 生成 1000 到 9999 之间的随机数
//        int randomNumber = random.nextInt(9000) + 1000;
//        final AccountDTO accountDTO = AccountDTO.builder().id(randomNumber).accountName("张三").accountCode(String.valueOf(randomNumber))
//                .amount(new BigDecimal("1234")).build();
//        return  accountClient.insert(accountDTO);
        return ResultData.success();
    }

    @Override
    public void addOrder(String productNo) {
        final OrderDTO dto = OrderDTO.builder().orderNo(String.valueOf(new Random().nextInt(9000)))
                .count(1).price(new BigDecimal("1000")).productCode(productNo)
                .amount(new BigDecimal("10000")).accountCode("1234").build();
        final Order order = new Order();
        BeanUtils.copyProperties(dto,order);
        this.save(order);
    }

}




