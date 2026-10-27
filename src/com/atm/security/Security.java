package com.atm.security;

public class Security implements ISecurity {
    @Override
    public boolean authenticate (String correctPin, String pin) {
        return correctPin.equals(pin);
    }
}
