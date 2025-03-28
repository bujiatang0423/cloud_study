package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.domain.Product;
import com.example.domain.ProductDTO;
import org.springframework.stereotype.Service;

/**
* @author bujiatang
* @description 针对表【product】的数据库操作Service
* @createDate 2025-03-26 10:11:40
*/
@Service
public interface ProductService extends IService<Product> {

    void reduceProduct(String productNo);

}
