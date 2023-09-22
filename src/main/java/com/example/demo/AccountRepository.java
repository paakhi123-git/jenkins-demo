package com.example.demo;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<AccountModel, Long> {
    // custom query methods
    List<AccountModel> findByStatus(String status);
    List<AccountModel> findByAccountType(String accountType);
	//AccountModel save(Optional<AccountModel> existingAccount);
}