package com.produce.mapper;

import com.produce.entity.Bsinven;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BsinvenMapper {
    int deleteByPrimaryKey(String invencode);

    int insert(Bsinven record);

    int insertSelective(Bsinven record);

    Bsinven selectByPrimaryKey(String invencode);

    int updateByPrimaryKeySelective(Bsinven record);

    int updateByPrimaryKey(Bsinven record);

//    查找所有记录
    List<Bsinven> findAll();
}