package com.example.demosrm.controller;


import com.example.demosrm.model.SrmModel;
import com.example.demosrm.service.SrmService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/srm")
public class SrmController {

    private static Logger log = LoggerFactory.getLogger(SrmController.class);
    @Autowired
    SrmService srmService;

    @GetMapping("/getAll")
    public List<SrmModel> getAllSrm(){
        log.info("Inside getAllSrm function");
        return srmService.getAllSrmData();
    }

    @PostMapping("/saveLoc")
    public SrmModel saveSrmLoc(@RequestBody SrmModel createRequestSrm)
    {
        log.info("Inside saveSrmLoc function to save {}",createRequestSrm.toString());
        return srmService.saveSrm(createRequestSrm);
    }
}
