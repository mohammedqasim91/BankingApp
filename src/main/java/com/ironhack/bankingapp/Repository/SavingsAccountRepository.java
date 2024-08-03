package com.ironhack.bankingapp.Repository;

import com.ironhack.bankingapp.entity.SavingsAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavingsAccountRepository extends JpaRepository<SavingsAccount, Long> {
    // Add specific methods if needed
}
