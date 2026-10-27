package com.atm.transaction;

/**
 * Interface:
 */
public interface ITransactionProcessor {
    void processTransaction(IAccount account, double amount);
}
