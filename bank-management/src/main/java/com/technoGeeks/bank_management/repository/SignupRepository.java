package com.technoGeeks.bank_management.repository;


import com.technoGeeks.bank_management.module.Signup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignupRepository extends JpaRepository<Signup, String> {

}
