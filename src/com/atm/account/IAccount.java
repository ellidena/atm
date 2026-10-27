package com.atm.account;

import com.atm.customer.ICustomer;

public interface IAccount {

    ICustomer getCustomer();
    double getBalance();
    boolean deposit(double amount);
    boolean withdraw(double amount);
}
