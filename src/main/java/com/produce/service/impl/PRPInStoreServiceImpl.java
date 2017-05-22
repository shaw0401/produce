package com.produce.service.impl;

import com.produce.entity.Prpinstore;
import com.produce.mapper.PrpinstoreMapper;
import com.produce.service.PRPInStoreService;
import com.produce.util.UUIDUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/5/13.
 */
@Service
@Transactional
public class PRPInStoreServiceImpl implements PRPInStoreService {
    @Resource
    private PrpinstoreMapper storeMapper;
    @Override
    public List<Prpinstore> findAllStore(String prproducecode) {
        return storeMapper.findAllStore(prproducecode);
    }

    @Override
    public void insert(Prpinstore inStore, String prinDate) throws ParseException {
        UUIDUtils uuidUtils=new UUIDUtils();
        String uuid = uuidUtils.getUUID();
        inStore.setPrincode(uuid);
        Date prindate=new SimpleDateFormat("yyyy-MM-dd").parse(prinDate);
        inStore.setPrindate(prindate);
        storeMapper.insert(inStore);
    }

    @Override
    public void deleteStore(String princode) {
        storeMapper.deleteStore(princode);
    }

    @Override
    public Prpinstore selectByStoreCode(String princode) {
        return storeMapper.selectByStoreCode(princode);
    }

    @Override
    public void storeUpdate(Prpinstore inStore,String prinDate) throws ParseException {
        Date prindate=new SimpleDateFormat("yyyy-MM-dd").parse(prinDate);
        inStore.setPrindate(prindate);
        storeMapper.storeUpdate(inStore);
    }
}
