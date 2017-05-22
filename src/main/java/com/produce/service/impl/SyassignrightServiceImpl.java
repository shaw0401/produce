package com.produce.service.impl;

import com.produce.entity.Syassignright;
import com.produce.mapper.SyassignrightMapper;
import com.produce.service.SyassignrightService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/5/13.
 */
@Service
@Transactional
public class SyassignrightServiceImpl implements SyassignrightService {
    @Resource
    private SyassignrightMapper operatorMapper;
    @Override
    public List<Syassignright> findAllOperator() {
        return operatorMapper.findAllOperator();
    }
}
