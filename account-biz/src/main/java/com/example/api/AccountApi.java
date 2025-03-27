package com.example.api;

import com.example.base.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * <p>
 * <code>AccountFeign</code>
 * </p>
 * Description:
 * @author JAVA日知录
 */

public interface AccountApi {
    @PostMapping("/insert")
    ResultData<String> insert(@RequestBody AccountDTO accountDTO);
}
