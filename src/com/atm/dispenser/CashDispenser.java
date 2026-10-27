package com.atm.dispenser;

public class CashDispenser implements ICashDispenser{
//ændring
    @Override
    public void cashDispenser (double amount) {
        System.out.println("Dispensing cash $:" + amount);
    }
}
