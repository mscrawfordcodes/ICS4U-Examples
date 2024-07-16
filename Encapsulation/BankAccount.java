package Encapsulation;
public class BankAccount {
    private double balance;
    private String firstName;
    private String lastName;
    private int accountNum;

    public BankAccount(double balance, String firstName, String lastName, int accountNum) {
        this.balance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNum = accountNum;
    }

    public double withdraw(double amount) {
        balance -= amount;
        return balance;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Balance: "+"$"+String.format("%.2f",this.balance)+" of "+this.firstName+" "+this.lastName+"\nAccount Number: "+this.accountNum;
    }

}