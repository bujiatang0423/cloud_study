package com.example.account.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.account.service.AccountService;
import com.example.account.vo.AccountVO;
import com.example.base.ResultData;
import com.example.account.domain.Account;
import com.example.account.dto.AccountDTO;
import com.example.account.mapper.AccountMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

/**
* @author bujiatang
* @description 针对表【account】的数据库操作Service实现
* @createDate 2025-03-26 10:11:40
*/
@Service
@RestController
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account>
    implements AccountService {
    @Override
    public ResultData<String> insert(AccountVO accountDTO) {
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




