package com.atm.card;

import com.atm.account.Account;
import com.atm.account.IAccount;

public class Card implements ICard {

    private String cardNumber;
    private IAccount account;
    private String pinCode;

    public Card(IAccount account, String cardNumber, String pinCode) {
        this.account = account;
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }


    public void setAccount(IAccount account) {
        this.account = account;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }


    @Override
    public IAccount getAccount(String cardNumber) {
        return account;
    }

    @Override
    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public String getPinCode() {
        return pinCode;
    }
}
