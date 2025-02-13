package com.banking.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Transaction {
    @Id
    private String transactionId;
    private String accountNumber;
    private String transactionType;
    private double amount;
    private String transactionDate;
    private String transactionTime;
    private String transactionStatus;
    
}
