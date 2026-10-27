package com.atm.card;

import com.atm.account.Account;
import com.atm.account.IAccount;

public interface ICard {

    public IAccount getAccount(String cardNumber);
    public String getCardNumber();
    public String getPinCode();



}
