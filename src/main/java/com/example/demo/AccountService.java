package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 
@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public AccountModel createAccount(AccountModel account) {
        // validate account information
        return accountRepository.save(account);
    }

    public List<AccountModel> getAllAccounts() {
        return (List<AccountModel>) accountRepository.findAll();
    }

    public List<AccountModel> getAccountsByStatus(String status) {
        return accountRepository.findByStatus(status);
    }

    public List<AccountModel> getAccountsByType(String accountType) {
        return accountRepository.findByAccountType(accountType);
    }
    
}