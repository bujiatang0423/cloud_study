package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.api.AccountDTO;
import com.example.base.ResultData;
import com.example.domain.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author bujiatang
 */
public interface AccountService  {
    ResultData<String> insert(AccountDTO accountDTO);

    ResultData<String> buy(String productCode);

}
