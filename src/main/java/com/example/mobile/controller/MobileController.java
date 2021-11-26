package com.example.mobile.controller;

import com.example.mobile.entity.Mobile;
import com.example.mobile.service.MobileService;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.query.QueryParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.misc.Contended;

import javax.websocket.server.PathParam;
import java.util.List;
// http://localhost:8080/mobiles/save
@RestController
@Slf4j
@RequestMapping("/mobiles")
public class MobileController {
    @Autowired
    private MobileService mobileService;

    @PostMapping("/save")
    public Mobile saveMobile(@RequestBody Mobile mobile) {
        //log.info("inside save mobile controller method");
        return mobileService.saveMobileModel(mobile);
    }
   /* @GetMapping("/{modelName}")
    public Mobile searchByModelName(@PathVariable ("modelName")String modelName){
        return mobileService.getMobileByModelName(modelName);
    }
    @GetMapping("/{getAll}")
    public List<Mobile> getAllMobiles(){
        return mobileService.getAllMobiles();
    }*/
}
