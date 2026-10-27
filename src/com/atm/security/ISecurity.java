package com.atm.security;

public interface ISecurity {
    boolean authenticate (String correctPin, String pin);
}
