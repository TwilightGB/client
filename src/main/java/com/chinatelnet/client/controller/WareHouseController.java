package com.chinatelnet.client.controller;

import com.chinatelnet.client.common.CommonDto;
import com.chinatelnet.client.po.WarehouseProduct;
import com.chinatelnet.client.service.WareHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/warehouse")
public class WareHouseController {
    String prefix = "warehouse";
    @Autowired
    private WareHouseService wareHouseService;

    @PostMapping("/save")
    @ResponseBody
    public CommonDto add(WarehouseProduct warehouseProduct){
        CommonDto commonDto = new CommonDto();
        warehouseProduct.setModifiedTime(new Date());
        List<WarehouseProduct> queryList = wareHouseService.list(warehouseProduct);
        if(!queryList.isEmpty()){
            commonDto.setCode(-1);
            commonDto.setMessage("已存在");
            return commonDto;
        }
        int result = wareHouseService.insertWarehouseProduct( warehouseProduct);
        if(result==1){
            commonDto.setCode(0);
        }else {
            commonDto.setCode(-1);
            commonDto.setMessage("insert failed");
        }
        return commonDto;
    }
    @GetMapping("/list")
    @ResponseBody()
    public List<WarehouseProduct> list(){
        WarehouseProduct warehouseProduct = new WarehouseProduct();
        return wareHouseService.list(warehouseProduct);
    }

    @GetMapping("/index")
    public String index(Model model){
        return prefix+"/index";
    }

    @GetMapping("/add")
    public String add(Model model){
        return prefix+"/add";
    }

    @PostMapping("/update")
    @ResponseBody
    public CommonDto update(WarehouseProduct warehouseProduct){
        CommonDto commonDto = new CommonDto();
        int result = wareHouseService.update(warehouseProduct);
        if(result>=0){
            commonDto.setCode(0);
            commonDto.setMessage("update success");
        }else{
            commonDto.setCode(-1);
            commonDto.setMessage("update failed");
        }
        return commonDto;
    }

    @GetMapping("/edit/{id}")
    String edit(@PathVariable("id") Integer id, Model model) {
        WarehouseProduct warehouseProduct = wareHouseService.getById(id);
        model.addAttribute("warehouseProduct", warehouseProduct);
        return prefix + "/edit";
    }
}