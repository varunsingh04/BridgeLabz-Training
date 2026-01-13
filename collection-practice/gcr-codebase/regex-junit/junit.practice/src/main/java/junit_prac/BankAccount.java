package junit_prac;

public class BankAccount {

    private double balance;

    // constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // depositMoney method
    public void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // withdrawMoney method
    public boolean withdrawMoney(double amount) {
        if (amount > balance || amount <= 0) {
            return false;
        }
        balance -= amount;
        return true;
    }

    // method to get balance
    public double getBalance() {
        return balance;
    }
}
