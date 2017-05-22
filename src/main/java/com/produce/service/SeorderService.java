package com.produce.service;

import com.produce.entity.Seorder;

import java.util.List;

/**
 * Created by Administrator on 2017/5/14.
 */
public interface SeorderService {

    List<Seorder> findAllOrder();

    Seorder findByOrdercode(String seordercode);
}
