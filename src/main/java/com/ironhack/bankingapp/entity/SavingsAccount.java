package com.ironhack.bankingapp.entity;

import jakarta.persistence.*;
//import javax.persistence.Entity;


@Entity
public class SavingsAccount extends Account {
    private Double interestRate;

    // Constructors, getters, and setters
    public SavingsAccount() {}

    public SavingsAccount(Long id, String accountNumber, Double balance, Double interestRate) {
        super(id, accountNumber, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() { return interestRate; }
    public void setInterestRate(Double interestRate) { this.interestRate = interestRate; }
}
