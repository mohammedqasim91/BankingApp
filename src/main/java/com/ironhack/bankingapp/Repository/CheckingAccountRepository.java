package com.ironhack.bankingapp.Repository;

import com.ironhack.bankingapp.entity.CheckingAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckingAccountRepository extends JpaRepository<CheckingAccount, Long> {
    // Add specific methods if needed
}
