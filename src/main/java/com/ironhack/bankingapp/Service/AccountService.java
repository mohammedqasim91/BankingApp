package com.ironhack.bankingapp.Service;

import com.ironhack.bankingapp.entity.Account;
import com.ironhack.bankingapp.Repository.AccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account getAccount(Long id) {
        return accountRepository.findById(id).orElse(null);
    }

    public Account getAccountByNumber(String accountNumber) {
        return accountRepository.findByAccountNumber(accountNumber);
    }

    @Transactional
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    @Transactional
    public Account updateAccount(Long id, Account updatedAccount) {
        if (accountRepository.existsById(id)) {
            updatedAccount.setId(id);
            return accountRepository.save(updatedAccount);
        }
        return null;
    }

    @Transactional
    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }
}
