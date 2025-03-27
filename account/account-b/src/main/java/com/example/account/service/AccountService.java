package com.example.account.service;

import com.example.account.vo.AccountVO;
import com.example.base.ResultData;
import com.example.account.dto.AccountDTO;

/**
 * @author bujiatang
 */
public interface AccountService  {
    ResultData<String> insert(AccountVO accountDTO);

}
