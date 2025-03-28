package com.example.controller;


import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.example.api.AccountApi;
import com.example.api.AccountDTO;
import com.example.base.ResultData;
import com.example.service.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bujiatang
 */
@RestController
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AccountController implements AccountApi {

    private final AccountService accountService;

    @Override
    @SentinelResource(value = "insert")
    public ResultData<String> insert(@RequestBody  AccountDTO accountDTO) {
        log.info("12312312312");
        return accountService.insert(accountDTO);
    }

    @PostMapping("/account/buy/{productCode}")
    public ResultData<String> buy(@PathVariable(value = "productCode") String productCode) {
        return accountService.buy(productCode);
    }


}
