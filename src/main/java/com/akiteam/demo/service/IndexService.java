package com.akiteam.demo.service;

import com.akiteam.demo.pojo.IndexGoodsTotal;
import com.akiteam.demo.pojo.IndexRemindTotal;
import com.akiteam.demo.pojo.UnreadInformation;
import com.akiteam.demo.pojo.UserId;

import java.util.List;

public interface IndexService {

    IndexGoodsTotal getGoodsTotal();

    IndexRemindTotal getRemindTotal(UserId userId);

    List<UnreadInformation> getUnreadInformation(UserId userId);
}
