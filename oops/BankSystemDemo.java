package oops;

// ==============================
// INTERFACE
// ==============================
interface Transaction {
    void deposit(double amount);
    void withdraw(double amount);
}

// ==============================
// ABSTRACT CLASS (ABSTRACTION)
// ==============================
abstract class BankAccount implements Transaction {

    private String accountHolder; // encapsulation
    protected double balance;
    private static int totalAccounts = 0; // static

    // Constructor
    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        totalAccounts++;
    }

    // Getter
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Common method
    public void showBalance() {
        System.out.println(accountHolder + " Balance: ₹" + balance);
    }

    // Static method
    public static void showTotalAccounts() {
        System.out.println("Total Accounts Created: " + totalAccounts);
    }

    // Abstract method
    abstract void accountType();
}

// ==============================
// SAVINGS ACCOUNT
// ==============================
class SavingsAccount extends BankAccount {

    private final double interestRate = 0.04; // final

    SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    void accountType() {
        System.out.println("Savings Account");
    }

    // Extra method
    void addInterest() {
        balance += balance * interestRate;
        System.out.println("Interest added");
    }
}

// ==============================
// CURRENT ACCOUNT
// ==============================
class CurrentAccount extends BankAccount {

    private double overdraftLimit = 1000;

    CurrentAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }

    @Override
    void accountType() {
        System.out.println("Current Account");
    }
}

// ==============================
// MAIN CLASS
// ==============================
public class BankSystemDemo {

    public static void main(String[] args) {

        // ===== Savings Account =====
        BankAccount acc1 = new SavingsAccount("Rishu", 5000);
        acc1.accountType();
        acc1.deposit(1000);
        acc1.withdraw(2000);
        acc1.showBalance();

        // Runtime Polymorphism
        BankAccount acc2 = new CurrentAccount("Amit", 2000);
        acc2.accountType();
        acc2.deposit(500);
        acc2.withdraw(3000);
        acc2.showBalance();

        // Static
        BankAccount.showTotalAccounts();

        // Access child-specific method
        SavingsAccount s = new SavingsAccount("Rahul", 4000);
        s.addInterest();
        s.showBalance();
    }
}