package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.api.AccountDTO;
import com.example.base.ResultData;
import com.example.domain.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author bujiatang
 */
@FeignClient(name = "account-service")
public interface AccountService extends IService<Account> {
    @PostMapping("/insert")
    ResultData<String> insert(@RequestBody AccountDTO accountDTO);

}
