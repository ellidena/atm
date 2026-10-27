package com.atm.card;

import com.atm.account.Account;
import com.atm.account.IAccount;
import com.atm.customer.Customer;

import java.util.HashMap;
import java.util.Map;

public class CardReader implements ICardReader{
    private final Map<String, Card> validCards = new HashMap<>() {
        {put("1234567890123456", new Card(new Account(new Customer("John", "H", "Doe"), 1000), "1234567890123456", "1234"));
        put("9876543210987654", new Card(new Account(new Customer("Jane", "L", "Doe"), 5000), "9876543210987654", "9876"));}
    };



    @Override
    public ICard validateCard(String cardNumber) {
        if (cardNumber != null && validCards.containsKey(cardNumber)) {
            return validCards.get(cardNumber);
        }
        return null;
    }
    }
