package org.piyush;

public class ATM implements ATMOperations
{
    private double balance = 5000.0;

    @Override
    public void checkBalance() {
        System.out.printf("Your current balance is: ₹%.2f%n", balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("₹%.2f has been deposited. New balance: ₹%.2f%n", amount, balance);
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("₹%.2f has been withdrawn. Remaining balance: ₹%.2f%n", amount, balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            System.out.println("Invalid amount. Withdrawal failed.");
        }
    }

    @Override
    public void exit() {
        System.out.println("Thank you for using the ATM. Goodbye!");
        System.exit(0);
    }
}


