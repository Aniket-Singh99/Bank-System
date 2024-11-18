package com.technoGeeks.bank_management.repository;


import com.technoGeeks.bank_management.module.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login, String> {
}