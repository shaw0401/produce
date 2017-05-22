package com.produce.mapper;

import com.produce.entity.Syassignright;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SyassignrightMapper {
    int deleteByPrimaryKey(String operatorcode);

    int insert(Syassignright record);

    int insertSelective(Syassignright record);

    Syassignright selectByPrimaryKey(String operatorcode);

    int updateByPrimaryKeySelective(Syassignright record);

    int updateByPrimaryKey(Syassignright record);

   //查找所有操作员
    List<Syassignright> findAllOperator();
}