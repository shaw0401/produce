package com.produce.service;

import com.produce.entity.Prproduce;

import java.text.ParseException;
import java.util.List;

/**
 * Created by Administrator on 2017/5/13.
 */
public interface PRProduceService {
    List<Prproduce> findAllProduce(String invencode);

    void insertProduce(Prproduce prproduce, String producedate, String startDate, String endDate) throws ParseException;

    void produceDelete(String prproducecode);

    Prproduce findByProduceCode(String prproducecode);

    void produceUpdate(Prproduce prproduce, String producedate, String startDate, String endDate) throws ParseException;


}
