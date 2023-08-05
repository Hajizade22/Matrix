package Lesson_10;

public class ClassWork {
    String accountNumber;
    String accountHolderName;
    String accountType;
    double balance;

    public ClassWork() {
        this.accountNumber = " ";
        this.accountHolderName = " ";
        this.accountType = " ";
        this.balance = 0.0;
    }

    public ClassWork(String accountNumber, String accountHolderName, String accounType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accounType;
        this.balance = 0.0;
    }

    public ClassWork(String accountNumber, String accountHolderName, String accounType, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accounType;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double deposit) {
        this.balance += deposit;
    }

    public void withdraw(double balance) {
        this.balance -= balance;
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountType='" + accountType + '\'' +
                ", balance=" + balance +
                '}';
    }
}
