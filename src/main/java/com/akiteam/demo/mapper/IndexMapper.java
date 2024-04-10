package com.akiteam.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;

@Mapper
public interface IndexMapper {

    /**
     * 获取商品总数
     * @return
     */
    Integer getGoodsTotal();

    /**
     * 获取商品总数
     * @return
     */
    Integer getRemindTotal(Integer id);
}
