package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.domain.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 *
* @author bujiatang
* @description 针对表【account】的数据库操作Mapper
* @createDate 2025-03-26 10:11:40
* @Entity generator.domain.Account
*/
@Mapper
public interface AccountMapper extends BaseMapper<Account> {

}




