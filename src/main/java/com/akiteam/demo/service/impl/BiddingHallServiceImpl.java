package com.akiteam.demo.service.impl;

import com.akiteam.demo.common.PageResult;
import com.akiteam.demo.common.R;
import com.akiteam.demo.entity.BiddingHall;
import com.akiteam.demo.entity.QuotationAmountTable;
import com.akiteam.demo.entity.QuotationTrend;
import com.akiteam.demo.mapper.BiddingHallMapper;
import com.akiteam.demo.mapper.QuotationAmountTableMapper;
import com.akiteam.demo.pojo.SaleorderBidingRequest;
import com.akiteam.demo.pojo.SaleorderHallRequest;
import com.akiteam.demo.pojo.SaleorderHallResult;
import com.akiteam.demo.service.BiddingHallService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class BiddingHallServiceImpl implements BiddingHallService {

    @Autowired
    private BiddingHallMapper biddingHallMapper;

    @Autowired
    private QuotationAmountTableMapper quotationAmountTableMapper;


    @Override
    public boolean addBiddingInfo(SaleorderBidingRequest saleorderBidingRequest) {
        biddingHallMapper.addBiddingInfo(saleorderBidingRequest);
        quotationAmountTableMapper.addBiddingInfo(saleorderBidingRequest);
        //TODO 可以加以判断，确定是否添加成功
        return true;
    }

    /**
     * 分页查询
     * @param saleorderHallRequest
     * @return
     */
    @Override
    public R<PageResult> pageQuery(SaleorderHallRequest saleorderHallRequest,String tradeName) {
        int pageNum = saleorderHallRequest.getLimit();
        int pageSize = saleorderHallRequest.getPages();
        PageHelper.startPage(pageNum, pageSize);
        Page<SaleorderHallResult> page = biddingHallMapper.pageQuery(saleorderHallRequest,tradeName);

        //获得的数据分页展示
        PageResult pageResult = new PageResult(page.getTotal(), page.getResult());
        return R.data(pageResult);
    }

    /**
     * 获取相关报价信息
     * @param id
     * @return
     */
    @Override
    public QuotationTrend getQuotationTrendInfo(Integer id){

        //用商品id获取商品信息
        BiddingHall biddingHall = biddingHallMapper.getInfoById(id);

        //将结束时间减去开始时间获得时间差值
        Date date1 = new Date(biddingHall.getStartTime());
        Date date2 = new Date(biddingHall.getEndTime());
        long diff = date2.getTime() - date1.getTime() - 28800000;
        SimpleDateFormat sdf = new SimpleDateFormat("dd天 HH时 mm分 ss秒");
        String timeNow= sdf.format(diff);
        String[] split = timeNow.split("天");
        int i = Integer.parseInt(split[0]) - 1;
        String substring = timeNow.substring(3);
        String date = i+"天"+substring;

        //获取报价金额和最高报价金额
        BigDecimal money = quotationAmountTableMapper.getMoney(biddingHall.getId());
        BigDecimal maxMoney = quotationAmountTableMapper.getMaxMoney(biddingHall.getId());

        //builder构造返回对象
        QuotationTrend quotationTrend = QuotationTrend.builder()
                .startTime(biddingHall.getStartTime())
                .endTime(biddingHall.getEndTime())
                .distanceEndTime(date)
                .highestQuotation(maxMoney)
                .tradeNum(biddingHall.getTradeNum())
                .money(money)
                .build();

        return quotationTrend;
    }

}
