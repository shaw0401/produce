package com.produce.mapper;

import com.produce.entity.Seorder;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SeorderMapper {
    int deleteByPrimaryKey(String seordercode);

    int insert(Seorder record);

    int insertSelective(Seorder record);

    Seorder selectByPrimaryKey(String seordercode);

    int updateByPrimaryKeySelective(Seorder record);

    int updateByPrimaryKey(Seorder record);
    //查询所有订单号
    List<Seorder> findAllOrder();
}