// Main class that creates two BankAccount objects and demonstrates the use of each of the methods.
public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123547896", 45000.00);
        BankAccount account2 = new BankAccount("147895623", 55000.00);

    // demonstrating the use of the above BankAccount Objects

    System.out.println("Initial balance of account 2: ¢" + account1.getBalance());
        account1.deposit(500000.00);
        System.out.println("Balance after depositing 50000 in account 1 : ¢" + account1.getBalance());
        account1.withdraw(6000.00);
        System.out.println("Balance after withdrawing ¢6,000 from account 1: ¢" + account1.getBalance());

    System.out.println("Initial balance of account 1: ¢" + account1.getBalance());
        account2.deposit(670000.00);
        System.out.println("Balance after depositing ¢670,000 in account 2 : ¢" + account2.getBalance());
        account2.withdraw(120000.00);
        System.out.println("Balance after withdrawing ¢120,000 from account 1: ¢" + account2.getBalance());



    }
    
}
