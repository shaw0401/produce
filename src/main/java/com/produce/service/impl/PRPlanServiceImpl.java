package com.produce.service.impl;


import com.produce.entity.Prplan;
import com.produce.mapper.PrplanMapper;
import com.produce.service.PRPlanService;
import com.produce.util.UUIDUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/5/12.
 */
@Service
@Transactional
public class PRPlanServiceImpl implements PRPlanService {
    @Resource
    private PrplanMapper planMapper;
    @Override
    public List<Prplan> findAllPlan(String seordercode) {
        return planMapper.findAllPlan(seordercode);
    }

    @Override
    public void insert(Prplan plan,String plandate,String enddate) throws ParseException {
         //设置主键为uuid，取前八位
        UUIDUtils uuidUtils=new UUIDUtils();
        String uuid = uuidUtils.getUUID();
        plan.setPrplancode(uuid);
        Date prplandate =new SimpleDateFormat("yyyy-MM-dd").parse(plandate);
        Date finishdate =new SimpleDateFormat("yyyy-MM-dd").parse(enddate);
        plan.setPrplandate(prplandate);
        plan.setFinishdate(finishdate);
        planMapper.insert(plan);
    }

    @Override
    public int insertSelective(Prplan plan) {
        return 0;
    }

    @Override
    public void planDelete(String prplancode) {
        planMapper.planDelete(prplancode);
    }

    @Override
    public Prplan findByPrplanCode(String prplancode) {
        return planMapper.findByPrplanCode(prplancode);
    }

    @Override
    public void updatePlan(Prplan prplan,String plandate,String enddate) throws ParseException {
        Date prplandate =new SimpleDateFormat("yyyy-MM-dd").parse(plandate);
        Date finishdate =new SimpleDateFormat("yyyy-MM-dd").parse(enddate);
        prplan.setPrplandate(prplandate);
        prplan.setFinishdate(finishdate);
        planMapper.updatePlan(prplan);
    }


}
