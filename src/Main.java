package app;

import model.*;
import service.BankService;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("MyBank");

        BankService service = new BankService(bank);

        service.createCustomer("C001", "Irfee", "9876543210", "irfee@mail.com");

        service.openSavingsAccount("C001", "A001", 10000, 0.05);
        service.openSavingsAccount("C001", "A002", 5000, 0.04);

        service.deposit("A001", 2000);

        service.withdraw("A002", 1000);

        service.transfer("A001", "A002", 1500);

        Account acc1 = bank.findAccount("A001");
        Account acc2 = bank.findAccount("A002");

        System.out.println("Balance of A001: " + acc1.getBalance());
        System.out.println("Balance of A002: " + acc2.getBalance());

        System.out.println("\nTransactions for A001:");
        for (Transaction t : acc1.getTransactions()) {
            System.out.println(t);
        }

        System.out.println("\nTransactions for A002:");
        for (Transaction t : acc2.getTransactions()) {
            System.out.println(t);
        }
    }
}