package com.example.api;


import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author bujiatang
 */
public interface ProductApi {

    @PostMapping("/reduceProduct")
    void reduceProduct(String productNo);

}
