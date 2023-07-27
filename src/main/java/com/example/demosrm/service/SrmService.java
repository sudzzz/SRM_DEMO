package com.example.demosrm.service;

import com.example.demosrm.model.SrmModel;
import com.example.demosrm.repository.SrmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SrmService {
    @Autowired
    SrmRepository srmRepository;

    public List<SrmModel> getAllSrmData(){
        return srmRepository.findAll();
    }

    public SrmModel saveSrm(SrmModel createRequestSrm){
        return srmRepository.save(createRequestSrm);
    }
}
