package com.example.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 
 * @author bujiatang
 * @TableName order
 */
@TableName(value ="order")
@Data
public class Order implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String orderNo;

    /**
     * 
     */
    private String accountCode;

    /**
     * 
     */
    private String productCode;

    /**
     * 
     */
    private Integer count;

    /**
     * 
     */
    private BigDecimal amount;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}