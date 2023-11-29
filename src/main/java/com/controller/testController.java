package com.controller;


import com.entity.StoreupEntity;
import com.service.StoreupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class testController {
    @Autowired
    private StoreupService storeupService;

    @RequestMapping("/list")
    public String data()
    {
        String aa =storeupService.queryAll();
        return aa;
    }

//    public List<StoreupEntity> data()
//    {
//        List<StoreupEntity> storeup =storeupService.queryAll();
//        System.out.println(storeup);
//        return storeup;
//    }


}
