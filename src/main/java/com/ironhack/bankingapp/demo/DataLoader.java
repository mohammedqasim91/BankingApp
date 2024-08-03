package com.ironhack.bankingapp.demo;

import com.ironhack.bankingapp.Repository.AccountRepository;
import com.ironhack.bankingapp.entity.CheckingAccount;
import com.ironhack.bankingapp.entity.SavingsAccount;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    public CommandLineRunner loadData(AccountRepository accountRepository) {
        return args -> {
            CheckingAccount checkingAccount = new CheckingAccount();
            checkingAccount.setAccountNumber("1234567890");
            checkingAccount.setBalance(1000.0);
            checkingAccount.setOverdraftLimit(500.0);
            accountRepository.save(checkingAccount);

            SavingsAccount savingsAccount = new SavingsAccount();
            savingsAccount.setAccountNumber("0987654321");
            savingsAccount.setBalance(2000.0);
            savingsAccount.setInterestRate(0.02);
            accountRepository.save(savingsAccount);
        };
    }
}
