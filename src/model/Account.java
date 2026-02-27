package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Account {

    private String accountHolder;
    private String accountNumber;
    protected double balance;

    private List<Transaction> transactions = new ArrayList<>();

    public Account(String accountHolder, String accountNumber, double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }

        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        validateAmount(amount);

        balance += amount;
        recordTransaction("DEPOSIT", amount);
    }

    public abstract void withdraw(double amount);

    public abstract double calculateInterest();

    protected void validateAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
    }

    protected void recordTransaction(String type, double amount) {
        transactions.add(new Transaction(type, amount));
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public List<Transaction> getTransactions() {
        return Collections.unmodifiableList(transactions);
    }
}