package com.example.demosrm.repository;

import com.example.demosrm.model.HrmsDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HrmsDetailRepository extends JpaRepository<HrmsDetail, HrmsDetail.HrmsPk> {
}
