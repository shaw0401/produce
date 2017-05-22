package com.produce.service.impl;

import com.produce.entity.Prproduce;
import com.produce.mapper.PrproduceMapper;
import com.produce.service.PRProduceService;
import com.produce.util.UUIDUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/5/13.
 */
@Service
@Transactional
public class PRProduceServiceImpl implements PRProduceService {
    @Resource
    private PrproduceMapper produceMapper;

    @Override
    public List<Prproduce> findAllProduce(String invencode )  {

        return produceMapper.findAllProduce(invencode);
    }

    @Override
    public void insertProduce(Prproduce prproduce, String producedate, String startDate, String endDate) throws ParseException {
         //主键为UUID
        UUIDUtils uuidUtils=new UUIDUtils();
        String uuid = uuidUtils.getUUID();
        prproduce.setPrproducecode(uuid);
      //设置日期格式
        Date  prproducedate=new SimpleDateFormat("yyyy-MM-dd").parse(producedate);
        Date startdate =new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
        Date enddate =new SimpleDateFormat("yyyy-MM-dd").parse(endDate);
        prproduce.setPrproducedate(prproducedate);
        prproduce.setStartdate(startdate);
        prproduce.setEnddate(enddate);
        produceMapper.insert(prproduce);
    }

    @Override
    public void produceDelete(String prproducecode) {
        produceMapper.produceDelete(prproducecode);
    }

    @Override
    public Prproduce findByProduceCode(String prproducecode) {
        return produceMapper.selectByProduceCode(prproducecode);
    }



    @Override
    public void produceUpdate(Prproduce prproduce, String producedate, String startDate, String endDate) throws ParseException {
        //设置日期格式
        Date  prproducedate=new SimpleDateFormat("yyyy-MM-dd").parse(producedate);
        Date startdate =new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
        Date enddate =new SimpleDateFormat("yyyy-MM-dd").parse(endDate);
        prproduce.setPrproducedate(prproducedate);
        prproduce.setStartdate(startdate);
        prproduce.setEnddate(enddate);
        produceMapper.produceUpdate(prproduce);
    }




}
