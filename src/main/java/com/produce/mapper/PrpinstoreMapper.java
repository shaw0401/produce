package com.produce.mapper;

import com.produce.entity.Prpinstore;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PrpinstoreMapper {
    int insert(Prpinstore record);

    int insertSelective(Prpinstore record);

    List<Prpinstore> findAllStore(String prproducecode);

    void deleteStore(String princode);

    Prpinstore selectByStoreCode(String princode);

    void storeUpdate(Prpinstore inStore);
}