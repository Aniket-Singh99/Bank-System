package com.technoGeeks.bank_management.module;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "bank")
@Data
public class Bank {
    @Id
    private String pin; // Primary key
    private String date;
    private String type;
    private String amount;
}
