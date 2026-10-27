package com.atm.security;

public interface ISecurity {
    boolean authentication (String correctPin, String pin);
}
