package com.miaoshaproject.controller.viewobject;

import lombok.Getter;
import lombok.Setter;

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
}
