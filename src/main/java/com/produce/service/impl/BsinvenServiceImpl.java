package com.produce.service.impl;

import com.produce.entity.Bsinven;
import com.produce.mapper.BsinvenMapper;
import com.produce.service.BsinvenService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/5/13.
 */
@Service
@Transactional
public class BsinvenServiceImpl implements BsinvenService {
    @Resource
    private BsinvenMapper bsinvenMapper;

    @Override
    public List<Bsinven> findAll() {
        return bsinvenMapper.findAll();
    }

    @Override
    public Bsinven findByInvencode(String invencode) {
        return bsinvenMapper.selectByPrimaryKey(invencode);
    }
}
