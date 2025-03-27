package com.example.account.controller;


import com.example.account.api.AccountApi;
import com.example.account.dto.AccountDTO;
import com.example.account.vo.AccountVO;
import com.example.base.ResultData;
import com.example.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bujiatang
 */
@RestController
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AccountController {

    private final AccountService accountService;

    @PostMapping("/insert")
    public ResultData<String> insert(@RequestBody AccountVO accountDTO) {
        log.info("12312312312");
        return accountService.insert(accountDTO);
    }
}
