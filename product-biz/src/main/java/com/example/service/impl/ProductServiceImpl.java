package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.domain.ProductDTO;
import com.example.service.ProductService;
import com.example.domain.Product;
import com.example.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description:
 * Product Service 接口层
 * @author JAVA日知录
 * @date 2019/12/2 15:09
 */
@Service
@Log4j2
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product>
        implements ProductService {

    @Override
    public void reduceProduct(String productNo) {
        final LambdaUpdateChainWrapper<Product> wrapper =
                lambdaUpdate().eq(Product::getProductCode, productNo)
                .setSql("count = count - 1");

        this.update(wrapper);
    }
}

