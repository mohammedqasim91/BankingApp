package com.ironhack.bankingapp;

import com.ironhack.bankingapp.Repository.AccountRepository;
import com.ironhack.bankingapp.Service.AccountService;
import com.ironhack.bankingapp.entity.CheckingAccount;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.*;

@SpringBootTest
public class AccountServiceTests {

    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private AccountService accountService;

    @Test
    void testCreateAccount() {
        CheckingAccount account = new CheckingAccount(null, "1234567890", 1000.0, 500.0);
        when(accountRepository.save(account)).thenReturn(account);
        accountService.createAccount(account);
        verify(accountRepository, times(1)).save(account);
    }
    
}

