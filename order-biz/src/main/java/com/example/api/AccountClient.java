package com.example.api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @author bujiatang
 */
@Component
@FeignClient(name = "account-biz")
public interface AccountClient extends AccountApi{


}
