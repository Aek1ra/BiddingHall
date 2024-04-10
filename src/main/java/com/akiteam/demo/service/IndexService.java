package com.akiteam.demo.service;

import com.akiteam.demo.pojo.IndexGoodsTotal;
import com.akiteam.demo.pojo.IndexRemindTotal;

public interface IndexService {

    IndexGoodsTotal getGoodsTotal();


    IndexRemindTotal getRemindTotal(Integer userId);
}
