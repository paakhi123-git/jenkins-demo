package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;
    
    @PostMapping
    public ResponseEntity<AccountModel> createBankAccount(@RequestBody AccountModel account) {
        try {
            AccountModel createdBankAccount =accountRepository.save(account);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdBankAccount);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<AccountModel>> getAllAccounts() {
        List<AccountModel> bankAccounts = (List<AccountModel>) accountRepository.findAll();
        return ResponseEntity.ok().body(bankAccounts);
    }

}
