package com.miaoshaproject.service.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @Auther: junruigong
 * @Date: 9/16/19
 * @Description: TODO
 */
@Getter
@Setter
public class OrderModel {
    private String id;
    private Integer userId;
    private Integer itemId;

    // 购买商品单价
    private BigDecimal itemPrice;

    // 购买数量
    private Integer amount;

    // 购买金额
    private BigDecimal orderPrice;
}
