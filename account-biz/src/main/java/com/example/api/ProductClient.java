package com.example.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @author bujiatang
 */
@Component
@FeignClient(name = "product-biz")
public interface ProductClient extends ProductApi {
}
