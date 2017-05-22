package com.produce.mapper;

import com.produce.entity.Prproduce;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PrproduceMapper {
    //删除生产信息
    void produceDelete(String prproducecode);
    //添加生产信息
    void insert(Prproduce record);


    Prproduce selectByProduceCode(String prproducecode);

    int updateByPrimaryKeySelective(Prproduce record);
    //更新生产信息表
    void produceUpdate(Prproduce record);
    //查找所有生产表
    List<Prproduce> findAllProduce(String invencode);

}