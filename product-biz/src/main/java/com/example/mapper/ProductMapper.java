package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.domain.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* @author bujiatang
* @description 针对表【product】的数据库操作Mapper
* @createDate 2025-03-26 10:11:40
* @Entity generator.domain.Product
*/
@Mapper
public interface ProductMapper extends BaseMapper<Product> {

    Product selectByCode(@Param("productCode") String productCode);

    int deleteByCode(@Param("productCode") String productCode);

}




