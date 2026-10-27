package com.atm.transaction;

import com.atm.account.IAccount;

/**
 * Takes an account and an amount
 */
public interface ITransactionProcessor {
    boolean processTransaction(IAccount account, double amount);
}
