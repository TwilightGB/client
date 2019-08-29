package com.chinatelnet.client.service;

import com.chinatelnet.client.po.WarehouseProduct;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WareHouseService {

    int currentCount(int productId);

    int insertWarehouseProduct(WarehouseProduct warehouseProduct);

    int update(WarehouseProduct warehouseProduct);

    WarehouseProduct getById(int id);

    List<WarehouseProduct> list(WarehouseProduct warehouseProduct);


}