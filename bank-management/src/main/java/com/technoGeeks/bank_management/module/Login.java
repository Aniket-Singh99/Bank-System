package com.technoGeeks.bank_management.module;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "login")
@Data
public class Login {
    @Id
    private String formno; // Primary key
    private String cardnumber;
    private String pin;
}