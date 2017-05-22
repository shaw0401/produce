package com.produce.service;

import com.produce.entity.Bsinven;

import java.util.List;

/**
 * Created by Administrator on 2017/5/13.
 */
public interface BsinvenService {

    List<Bsinven> findAll();

    Bsinven findByInvencode(String invencode);
}
