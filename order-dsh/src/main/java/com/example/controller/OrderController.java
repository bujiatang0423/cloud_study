package com.example.controller;

import com.example.base.ResultData;
import com.example.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bujiatang
 */

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired) )
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/order/test")
    ResultData<String> selectByNo(String orderNo){
        return  orderService.selectByNo("dsh-1234");
    }
}
