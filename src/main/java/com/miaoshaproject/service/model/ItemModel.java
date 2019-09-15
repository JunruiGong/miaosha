package com.miaoshaproject.service.model;

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
public class ItemModel {

    private Integer id;

    @NotBlank(message = "商品名称不能为空")
    private String title;

    @NotNull(message = "商品价格不能为空")
    @Min(value = 0, message = "商品价格必须大于0")
    private BigDecimal price;

    @NotNull(message = "库存必填")
    private Integer stock;

    @NotBlank(message = "描述信息不能为空")
    private String description;
    private Integer sales;

    @NotBlank(message = "图片信息不能为空")
    private String imgUrl;
}
