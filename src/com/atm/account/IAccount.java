package com.atm.account;

import com.atm.customer.ICustomer;

public interface IAccount {

    ICustomer getCustomer();
    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);
}
