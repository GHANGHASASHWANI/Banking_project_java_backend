package com.banking.Service;
import com.banking.Model.*;
import com.banking.Exception.*;

public class TransactionManagement {
    public static void main(String[] args) {
        Account account=new Account();
        account.setBalance(1000);
        double amount=2000;
        try{
            checkBalance(account,amount);
        }
        catch(InsufficientFund e){
            System.out.println(e.getMessage());
        }
    }
    public static void checkBalance(Account account,double amount){
        if(account.getBalance()<amount){
            throw new InsufficientFund("Insufficient balance in your account to withdraw ");
        }
        else{
            System.out.println("Amount withdrawn successfully");
        }
    }
}
