package com.banking.Model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {
    @Id
    private String userId;
    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;
}
