package com.produce.mapper;

import com.produce.entity.Prproduceitem;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrproduceitemMapper {
    //根据物料需求量id删除
    void deleteByItemId(Integer id);
     //添加物料需求量信息
    void insert(Prproduceitem record);

    int insertSelective(Prproduceitem record);
    //根据物料需求量id查找对应表单
    Prproduceitem selectByItemId(Integer id);
     //更新物料需求表单
    void updateItem(Prproduceitem record);

    int updateByPrimaryKey(Prproduceitem record);
     //查找所有物料信息
    List<Prproduceitem> selectAllItems(String prproducecode);
}