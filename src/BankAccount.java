public class BankAccount {
    private String accountNumber;
    private double balance;



public BankAccount(String accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    }

public double deposit(double amount ) {
    balance += amount;
    return balance;
    }

public double withdraw(double amount) {
    if (amount > balance) {
        System.out.println("Insufficient balance");
    } else {
            balance -= amount;
      }
    return balance;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * @return String return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

}
