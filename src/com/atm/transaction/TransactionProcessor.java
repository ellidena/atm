package com.atm.transaction;

import com.atm.account.IAccount;

/**
 * Processes transactions by taking an account and
 * calling either withdraw or deposit
 */
public class TransactionProcessor implements ITransactionProcessor {
    private IAccount account;

    public TransactionProcessor(IAccount account)  {// maybe more?
            this.account = account;
        }
        @Override
        public boolean processTransaction(IAccount account, double amount) {
            if (account != null) {
                if (account.withdraw(amount)) {
                    System.out.println(amount + " withdrawn from account: " + account);
                    return true;
                }
                if (account.deposit(amount)) {
                    System.out.println(amount + " deposited to account: " + account);
                    return true;
                }
            }
            System.out.println("No account provided. Exiting transaction procession.");
            return false; // No account provided
        }

    // Getters and Setters
    public IAccount getAccount() {
        return account;
    }
    public void setAccount(IAccount account) {
        this.account = account;
    }
}



