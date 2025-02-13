package com.banking.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Loan {
    @Id
    private String loanId;
    private String accountNumber;
    private String loanType;
    private double loanAmount;
    private double interestRate;
    private int duration;
    private double totalAmount;
    private double paidAmount;
    private double remainingAmount;
}
