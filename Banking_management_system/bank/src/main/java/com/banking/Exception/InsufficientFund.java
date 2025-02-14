package com.banking.Exception;

public class InsufficientFund extends RuntimeException{
    public InsufficientFund(String message){
        System.out.println(message);
    }
}