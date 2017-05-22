package com.produce.mapper;

import com.produce.entity.Prplan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrplanMapper {
    int insert(Prplan record);
    int insertSelective(Prplan record);
    List<Prplan> findAllPlan(String seordercode);

    void planDelete(String prplancode);

    Prplan findByPrplanCode(String prplancode);

    void updatePlan(Prplan prplan);
}