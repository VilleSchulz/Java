
//Task 1: Creating a Simple Bank Account Management System
//
//In this exercise, you'll create a simple bank account management system using static variables and methods.
// You'll create a BankAccount class with instance variables for the account number and balance. The totalAccounts
// static variable keeps track the total number of accounts. You'll also implement instance methods for depositing and
// withdrawing funds, as well as a static method to retrieve the total number of accounts. The main method demonstrates
// how to use the class by creating accounts, performing transactions, and checking the total number of accounts.
package bank_t01;

public class BankAccount {
    static int numbetOfAccounts;
    private final int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double StartBalance) {
        this.accountNumber = accountNumber;
        this.balance = StartBalance;
        numbetOfAccounts++;


    }

    private void deposit(double Amount) {
        this.balance += Amount;

    }

    private void withdraw(double Amount) {
        this.balance -= Amount;
    }

    static int getNumbetOfAccounts() {
        return numbetOfAccounts;
    }
private double getBalance() {
        return balance;
}
private int getAccountNumber() {
        return accountNumber;
}
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1, 500);
        BankAccount account2 = new BankAccount(2, 2);
        BankAccount account3 = new BankAccount(3, 5000);
        BankAccount account4 = new BankAccount(4, 100000);
        account1.deposit(500);
       account2.withdraw(1000);
        System.out.println("Account: "+ account1.getAccountNumber()+ " balance: "+ account1.getBalance());
        System.out.println("Account: "+ account2.getAccountNumber()+ " balance: "+ account2.getBalance());
    }
}
