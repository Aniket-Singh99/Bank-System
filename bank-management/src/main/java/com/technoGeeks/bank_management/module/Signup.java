package com.technoGeeks.bank_management.module;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "signup")
@Data
public class Signup {
    @Id
    private String formno; // Primary key
    private String address;
    private String city;
    private String pin_code;
    private String state;
    private String name;
    private String father_name;
    private String dob;
    private String gender;
    private String email;
    private String marital_status;
}