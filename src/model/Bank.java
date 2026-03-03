package model;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String bankName;
    private List<Customer> customers = new ArrayList<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer findCustomer(String customerId) {
        for (Customer c : customers) {
            if (c.getCustomerId().equals(customerId)) {
                return c;
            }
        }
        return null;
    }

    public Account findAccount(String accountNumber) {
        for (Customer c : customers) {
            Account acc = c.getAccount(accountNumber);
            if (acc != null) {
                return acc;
            }
        }
        return null;
    }

    public String getBankName() {
        return bankName;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}