package com.banking.Model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Employee extends User{
    private String department;
    private double salary;
    private String designation;
    private String branch;
    private String ifscCode;

}
