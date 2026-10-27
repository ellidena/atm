package com.atm.account;

import com.atm.customer.Customer;
import com.atm.customer.ICustomer;

public class Account implements IAccount {

    private ICustomer customer;
    private double balance;


    public Account(ICustomer customer, double balance) {
        this.customer = customer;
        this.balance = balance;
    }


    @Override
    public ICustomer getCustomer() {
        return customer;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {

        if (amount > 0 ) {
            balance += amount;
            System.out.println("Success " + amount + " got added to your balance");
        }
        else {
            System.out.println("You cannot deposit zero or less");
    }

    @Override
    public void withdraw(double amount) {

    }

}
