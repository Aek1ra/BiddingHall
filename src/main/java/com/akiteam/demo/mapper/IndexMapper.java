package com.akiteam.demo.mapper;

import com.akiteam.demo.pojo.UnreadInformation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
public interface IndexMapper {
    Integer getGoodsTotal();

    Integer getRemindTotal(Integer userId);

    List<UnreadInformation> getUnreadInformation(@RequestParam("userId") Integer userId);
}
