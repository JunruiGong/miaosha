package com.miaoshaproject.controller.viewobject;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @Auther: junruigong
 * @Date: 9/14/19
 * @Description: TODO
 */
@Getter
@Setter
public class ItemVO {


    private Integer id;

    private String title;
    private BigDecimal price;

    private Integer stock;

    private String description;
    private Integer sales;

    private String imgUrl;

    // 记录商品是否在秒杀活动中，为0表示没有秒杀活动，为1表示秒杀活动待开始，为2表示正在进行
    private Integer promoStatus;

    private BigDecimal promoPrice;

    private Integer promoId;

    private String startDate;
}
