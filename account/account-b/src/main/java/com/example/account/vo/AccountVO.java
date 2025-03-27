package com.example.account.vo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 接口传输层
 * @author JAVA日知录
 * @date 2019/12/4 16:27
 */
@Data
@Builder
public class AccountVO implements Serializable {
    private Integer id;
    private String accountCode;
    private String accountName;
    private BigDecimal amount;

}
