package com.example.demosrm.repository;

import com.example.demosrm.model.LoginDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<LoginDetail, LoginDetail.LoginPk> {
}
