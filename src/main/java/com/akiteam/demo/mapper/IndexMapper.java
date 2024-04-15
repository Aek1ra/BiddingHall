package com.akiteam.demo.mapper;

import com.akiteam.demo.pojo.UnreadInformation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Mapper
public interface IndexMapper {

    /**
     * 获取商品总数
     * @return
     */
    Integer getGoodsTotal();

    /**
     * 获取商品总数
     * @param userId
     * @return
     */
    Integer getRemindTotal(Integer userId);

    /**
     * 获取用户未读通知
     * @param userId
     * @return
     */
    List<UnreadInformation> getUnreadInformation(Integer userId);
}
