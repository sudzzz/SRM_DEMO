package com.example.demosrm.repository;

import com.example.demosrm.model.SrmModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SrmRepository extends JpaRepository<SrmModel,String> {
}
