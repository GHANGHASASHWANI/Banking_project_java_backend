package com.banking.Database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Transaction extends JpaRepository<Transaction, String>{
    void saveAll(List<Transaction> transactions);
    void save(Transaction transaction);

    Transaction findById(String id);
    List<Transaction> findAll();

    Transaction findByTransactionNumber(String transactionNumber);
    Transaction findByAccountNumber(String accountNumber);

    void deleteById(String id);
    void deleteByAccountNumber(String accountNumber);
    void delete(Transaction transaction);
}
