package com.technoGeeks.bank_management.module;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "signuptwo")
@Data
public class SignupTwo {
    @Id
    private String formno; // Primary key
    private String religion;
    private String category;
    private String income;
    private String education;
    private String occupation;
    private String pan;
    private String aadhar;
    private String seniorcitizen;
    private String existingaccount;
}