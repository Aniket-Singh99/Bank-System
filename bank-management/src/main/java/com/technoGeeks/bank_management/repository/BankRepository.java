package com.technoGeeks.bank_management.repository;



import com.technoGeeks.bank_management.module.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, String> {
}