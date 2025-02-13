package com.banking.Database;
import com.banking.Model.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class Database {
    private List<Account> accounts;
    private List<Employee> employees;
    private List<Transaction> transactions;
    private List<Loan> loans;

    public Database(List<Account> accounts, List<Employee> employees, List<Transaction> transactions, List<Loan> loans) {
        this.accounts = accounts;
        this.employees = employees;
        this.transactions = transactions;
        this.loans = loans;
    }

    

}
