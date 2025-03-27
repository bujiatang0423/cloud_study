package com.example.account.api;

import com.example.base.ResultData;
import com.example.account.dto.AccountDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * <code>AccountFeign</code>
 * </p>
 * Description:
 * @author JAVA日知录
 */


@FeignClient(name = "account-server")
public interface AccountApi {
    @PostMapping("/rpc-api/insert")
    ResultData<String> insert(@RequestBody AccountDTO accountDTO);

}
