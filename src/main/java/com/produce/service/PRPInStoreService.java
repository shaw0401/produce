package com.produce.service;

import com.produce.entity.Prpinstore;

import java.text.ParseException;
import java.util.List;

/**
 * Created by Administrator on 2017/5/13.
 */
public interface PRPInStoreService {
    List<Prpinstore> findAllStore(String prproducecode);

    void insert(Prpinstore inStore, String prinDate) throws ParseException;

    void deleteStore(String princode);

    Prpinstore selectByStoreCode(String princode);

    void storeUpdate(Prpinstore inStore,String prinDate) throws ParseException;
}
