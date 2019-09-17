package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.ItemModel;
import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: junruigong
 * @Date: 9/14/19
 * @Description: TODO
 */

public interface ItemService {

    // 创建商品
    ItemModel createItem(ItemModel itemModel) throws BusinessException;

    // 商品列表浏览
    List<ItemModel> listItem();


    // 商品详情浏览
    ItemModel getItemById(Integer id);

    // 库存扣减
    boolean decreaseStock(Integer itemId, Integer amount);

    // 商品销量增加
    void increaseSales(Integer itemId,Integer amount);


}
