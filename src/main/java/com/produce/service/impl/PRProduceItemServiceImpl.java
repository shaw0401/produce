package com.produce.service.impl;

import com.produce.entity.Prproduceitem;
import com.produce.mapper.PrproduceitemMapper;
import com.produce.service.PRProduceItemService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/5/13.
 */
@Service
@Transactional
public class PRProduceItemServiceImpl implements PRProduceItemService {
    @Resource
    private PrproduceitemMapper produceitemMapper;

    @Override
    public List<Prproduceitem> findAllItems(String prproducecode) {
        return produceitemMapper.selectAllItems(prproducecode);
    }

    @Override
    public void addProduceItem(Prproduceitem produceItem) {
        produceitemMapper.insert(produceItem);
    }

    @Override
    public void deleteProductItem(int id) {
        produceitemMapper.deleteByItemId(id);
    }

    @Override
    public Prproduceitem selectByItemId(int id) {
        return produceitemMapper.selectByItemId(id);
    }

    @Override
    public void updateProductItem(Prproduceitem produceItem) {
        produceitemMapper.updateItem(produceItem);
    }
}
