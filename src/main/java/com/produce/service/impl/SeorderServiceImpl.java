package com.produce.service.impl;

import com.produce.entity.Seorder;
import com.produce.mapper.SeorderMapper;
import com.produce.service.SeorderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/5/14.
 */
@Service
@Transactional
public class SeorderServiceImpl implements SeorderService {

    @Resource
    SeorderMapper seorderMapper;
    @Override
    public List<Seorder> findAllOrder() {
        return seorderMapper.findAllOrder();
    }

    @Override
    public Seorder findByOrdercode(String seordercode) {
        return seorderMapper.selectByPrimaryKey(seordercode);
    }
}
