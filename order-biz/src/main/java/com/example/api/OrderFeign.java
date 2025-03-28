package com.example.api;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author bujiatang
 */
public interface OrderFeign {

    @PostMapping("/addOrder/{productNo}")
    void addOrder(@PathVariable(value = "productNo") String productNo);
}
