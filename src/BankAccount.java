import java.util.Scanner;

// Class representing a Bank Account
class BankAccount {
    private String accountHolder;
    private String accountPassword;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, String accountPassword, double balance) {
        this.accountHolder = accountHolder;
        this.accountPassword = accountPassword;
        this.balance = balance;
    }

    // Method to validate user login
    public boolean login(String name, String password) {
        return this.accountHolder.equals(name) && this.accountPassword.equals(password);
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount + ". Remaining balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}
