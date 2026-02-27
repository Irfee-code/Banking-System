package model;
import java.util.*;

public class SavingsAccount extends Account {
    private double interest;

    public SavingsAccount(String accountHolder,String accountNumber,double balance,double interest)
    {
        super(accountHolder,accountNumber,balance);
        this.interest=interest;
    }

    @Override
    public void withdraw(double amount)
    {
        validateAmount(amount);
        if(balance<amount)
        {
            throw new IllegalStateException("Insufficient Balance");
        }
        balance-=amount;
        recordTransaction("Withdraw",amount);
    }

    @Override
    public double calculateInterest()
    {
        return balance*interest;
    }
}
