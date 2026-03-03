package service;

import model.*;

public class BankService {

    private Bank bank;

    public BankService(Bank bank) {
        this.bank = bank;
    }

    public void createCustomer(String id, String name, String phone, String email) {
        Customer customer = new Customer(id, name, phone, email);
        bank.addCustomer(customer);
    }

    public void openSavingsAccount(String customerId, String accNumber, double initialBalance, double interestRate) {
        Customer customer = bank.findCustomer(customerId);
        if (customer == null) {
            throw new RuntimeException("Customer not found");
        }

        SavingsAccount account = new SavingsAccount(
                customer.getName(),
                accNumber,
                initialBalance,
                interestRate
        );

        customer.addAccount(account);
    }

    public void deposit(String accountNumber, double amount) {
        Account acc = bank.findAccount(accountNumber);
        if (acc == null) {
            throw new RuntimeException("Account not found");
        }

        acc.deposit(amount);
    }

    public void withdraw(String accountNumber, double amount) {
        Account acc = bank.findAccount(accountNumber);
        if (acc == null) {
            throw new RuntimeException("Account not found");
        }

        acc.withdraw(amount);
    }

    public void transfer(String fromAcc, String toAcc, double amount) {
        Account sender = bank.findAccount(fromAcc);
        Account receiver = bank.findAccount(toAcc);

        if (sender == null || receiver == null) {
            throw new RuntimeException("Account not found");
        }

        sender.withdraw(amount);
        receiver.deposit(amount);
    }
}