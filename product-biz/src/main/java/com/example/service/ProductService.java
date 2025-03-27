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

    /**
     * 新增产品
     */
    ProductDTO insertProduct(ProductDTO accountVO);

    /**
     * 删除产品
     */
    int deleteProduct(String accountCode);

    /**
     * 更新产品
     */
    ProductDTO updateProduct(ProductDTO accountVO);

    /**
     * 根据产品编码查找产品详细信息
     */
    ProductDTO selectByCode(String productCode);

    /**
     * 扣减库存
     */
    void deduct(String productCode, Integer count);

}
