package com.example.account.api;

import com.example.account.dto.AccountDTO;
import com.example.account.service.AccountService;
import com.example.account.vo.AccountVO;
import com.example.base.ResultData;
import com.example.utils.BeanUtils;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AccountApiImpl implements AccountApi {

    @Resource
    private AccountService accountService;

    @Override
    public ResultData<String> insert(AccountDTO accountDTO) {
        return accountService.insert(BeanUtils.toBean(accountDTO, AccountVO.class));
    }
}
