package com.miaoshaproject.service.model;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther: junruigong
 * @Date: 9/16/19
 * @Description: TODO
 */
@Getter
@Setter
public class PromoModel {
    private Integer id;
    private String promoName;
    private DateTime StartDate;
    private DateTime endDate;

    private Integer itemId;

    private BigDecimal promoItemPrice;

    // 秒杀活动状态:1,表示未开始；2，表示进行中；3，表示已结束
    private Integer status;


}
