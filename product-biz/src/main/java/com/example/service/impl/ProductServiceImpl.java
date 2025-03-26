package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.service.ProductService;
import domain.Product;
import com.example.mapper.ProductMapper;
import org.springframework.stereotype.Service;

/**
* @author bujiatang
* @description 针对表【product】的数据库操作Service实现
* @createDate 2025-03-26 10:11:40
*/
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product>
    implements ProductService {

}




