package com.produce.service;


import com.produce.entity.Prplan;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.util.List;

/**
 * Created by Administrator on 2017/5/12.
 */

public interface PRPlanService {
    List<Prplan> findAllPlan(String seordercode);

    void insert(Prplan plan,String plandate,String enddate)throws ParseException;

    int insertSelective(Prplan plan);

    void planDelete(String prplancode);

    Prplan findByPrplanCode(String prplancode);

    void updatePlan(Prplan prplan,String plandate,String enddate) throws ParseException;
}
