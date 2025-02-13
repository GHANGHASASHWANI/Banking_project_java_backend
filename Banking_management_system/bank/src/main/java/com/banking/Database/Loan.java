package com.banking.Database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Loan extends JpaRepository<Loan, String> {
    void saveAll(List<Loan> loans);

    Loan findById(int id);
    List<Loan> findAll();

    Loan findByLoanNumber(String loanNumber);
    Loan findByAccountNumber(String accountNumber);

    void deleteById(String id);
    void deleteByAccountNumber(String accountNumber);
    void delete(Loan loan);
    
}
