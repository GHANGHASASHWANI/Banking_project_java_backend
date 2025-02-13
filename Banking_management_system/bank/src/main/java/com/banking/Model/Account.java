package com.banking.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Account {
    @Id
    private String accountId;
    @Column(unique = true)
    private String accountNumber;
    private String accountType;
    private String branch;
    private String ifscCode;
    private double balance;
}
