package com.banking.Database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Account extends JpaRepository<Account, Integer> {

    void saveAll(List<Account> accounts);

    Account findById(int id);
    List<Account> findAll();

    Account findByAccountNumber(String accountNumber);
    

    void deleteById(int id);
    void delete(Account account);
    void deleteAll();

}
