package model;

public class CurrentAccount extends Account{
    private double overdraftLimit;

    public CurrentAccount(String accountHolder,String accountNumber,double balance,double overdraftLimit)
    {
        super(accountHolder,accountNumber,balance);
        this.overdraftLimit=overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        validateAmount(amount);

        if (balance - amount < -overdraftLimit) {
            throw new IllegalStateException("Overdraft limit exceeded");
        }

        balance -= amount;
        recordTransaction("WITHDRAW", amount);
    }

    @Override
    public double calculateInterest()
    {
        return 0;
    }
}
