package com.example.domain;


import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Description:
 * 订单DTO
 * @author jianzh5
 * @date 2019/12/16 16:39
 */
@Data
@Builder
public class OrderDTO implements Serializable {
    private Integer id;
    private String orderNo;
    private String accountCode;
    private String productCode;
    private Integer count;
    //总金额
    private BigDecimal amount;
    //单价
    private BigDecimal price;
    private String status;


}
