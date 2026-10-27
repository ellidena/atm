package com.atm.dispenser;

public class CashDispenser implements ICashDispenser{

    @Override
    public void cashDispenser (double amount) {
        System.out.println("Dispensing cash $:" + amount);
    }
}
