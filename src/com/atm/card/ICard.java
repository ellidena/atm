package com.atm.card;

public interface ICard {

    public IAccount getAccount(String cardNumber);
    public String getCardNumber();
    public String getPinCode();



}
