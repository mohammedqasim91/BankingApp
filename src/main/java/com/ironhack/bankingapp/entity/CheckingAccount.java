package com.ironhack.bankingapp.entity;
import jakarta.persistence.*;
//import javax.persistence.Entity;

@Entity
public class CheckingAccount extends Account {
    private Double overdraftLimit;

    // Constructors, getters, and setters
    public CheckingAccount() {}

    public CheckingAccount(Long id, String accountNumber, Double balance, Double overdraftLimit) {
        super(id, accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public Double getOverdraftLimit() { return overdraftLimit; }
    public void setOverdraftLimit(Double overdraftLimit) { this.overdraftLimit = overdraftLimit; }
}