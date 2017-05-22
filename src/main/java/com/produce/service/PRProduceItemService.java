package com.produce.service;

import com.produce.entity.Prproduceitem;

import java.util.List;

/**
 * Created by Administrator on 2017/5/13.
 */
public interface PRProduceItemService {
    List<Prproduceitem> findAllItems(String prproducecode);

    void addProduceItem(Prproduceitem produceItem);

    void deleteProductItem(int id);

    Prproduceitem selectByItemId(int id);

    void updateProductItem(Prproduceitem produceItem);
}
