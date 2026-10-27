package com.atm.transaction;

import com.atm.account.IAccount;

/**
 * Interface:
 */
public interface ITransactionProcessor {
    void processTransaction(IAccount account, double amount);
}
