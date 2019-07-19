package com.chinatelnet.client.dao;


import com.chinatelnet.client.po.WarehouseInfo;

import java.util.List;

/**
*  @author gengbin
*/
public interface WarehouseInfoDao {

    int insertWarehouseInfo(WarehouseInfo object);

    int updateWarehouseInfo(WarehouseInfo object);

    int update(WarehouseInfo.UpdateBuilder object);

    List<WarehouseInfo> queryWarehouseInfo(WarehouseInfo object);

    WarehouseInfo queryWarehouseInfoLimit1(WarehouseInfo object);

}