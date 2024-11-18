package com.technoGeeks.bank_management.module;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "signupthree")
@Data
public class SignupThree {
    @Id
    private String formno; // Primary key
    private String accountType;
    private String cardnumber;
    private String pin;
    private String facility;
}