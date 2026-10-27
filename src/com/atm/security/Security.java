package com.atm.security;

public class Security implements ISecurity {
    @Override
    public boolean authenticate (String correctPin, String pin) {
        if (correctPin==null && pin==null){
            return false;
        }

        if (!pin.matches ("\\d{4}")){
            return false;
        }
        return correctPin.equals(pin);
    }
}
