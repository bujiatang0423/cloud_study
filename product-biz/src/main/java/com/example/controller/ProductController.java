package com.example.controller;

import com.example.api.ProductApi;
import com.example.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bujiatang
 */
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ProductController implements ProductApi {

    private final ProductService productService;
    @Override
    public void reduceProduct(String productNo) {

    }
}
