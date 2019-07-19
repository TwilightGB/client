package com.chinatelnet.client.controller;

import com.chinatelnet.client.service.WareHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountServiceController {
    @Autowired
    private WareHouseService wareHouseService;
    @GetMapping("/count")
    public String count(Integer id){
        return wareHouseService.currentCount(id)+"";
    }
}