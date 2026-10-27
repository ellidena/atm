package com.atm.transaction;

import com.atm.account.IAccount;

/**
 * Processes transactions
 */
public class TransactionProcessor implements ITransactionProcessor {
    private IAccount account;

    public TransactionProcessor(IAccount account)  {// maybe more?
            this.account = account;
        }

        @Override
        public void processTransaction(IAccount account, double amount) {
            if (account != null) {
                if (account.transactionType.WITHDRAWAL) {
                    account.withdraw(amount);
                    System.out.println(amount + " withdrawn from account: " + account);
                }
                if (account.transactionType.DEPOSIT) {
                    account.deposit(amount);
                    System.out.println(amount + " deposited to account: " + account);
                }
            }
            else {
                System.out.println("No account provided. Exiting transaction procession.");
            }

        }

    // Getters and Setters
    public IAccount getAccount() {
        return account;
    }
    public void setAccount(IAccount account) {
        this.account = account;
    }
}



