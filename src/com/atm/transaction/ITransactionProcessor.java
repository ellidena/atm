package com.atm.transaction;

import com.atm.account.IAccount;

/**
 * Takes a string method (withdraw, deposit) and a account and an amount
 *
 */
public interface ITransactionProcessor {
    boolean processTransaction(IAccount account, double amount);
}
