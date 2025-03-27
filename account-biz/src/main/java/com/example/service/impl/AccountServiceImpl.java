package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.api.AccountDTO;
import com.example.base.ResultData;
import com.example.domain.Account;
import com.example.mapper.AccountMapper;
import com.example.service.AccountService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author bujiatang
* @description 针对表【account】的数据库操作Service实现
* @createDate 2025-03-26 10:11:40
*/
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account>
    implements AccountService {
    @Override
    public ResultData<String> insert(AccountDTO accountDTO) {
        final Account account = new Account();
        BeanUtils.copyProperties(accountDTO,account);
        final boolean save = this.save(account);
        if(save){
            return ResultData.success();
        }else {
            return ResultData.fail();
        }
    }
}




