package com.atm.account;

public interface IAccount {

    ICustomer getCustomer();
    double getBalance();
    void deposit();
    void withdraw();
}
