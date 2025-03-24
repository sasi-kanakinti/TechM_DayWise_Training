abstract class BankAccount {
    String accountHolder;
    double balance;
 
    BankAccount(String holder, double bal) {
        this.accountHolder = holder;
        this.balance = bal;
    }
 
    abstract void deposit(double amount); // Abstract method (no body)
 
    void showBalance() { // Concrete method (with body)
        System.out.println("Balance: $" + balance);
    }
}
 
class SavingsAccount extends BankAccount {
    SavingsAccount(String holder, double bal) {
        super(holder, bal);
    }
 
    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " in Savings Account");
    }
}
 
public class Bank {
    public static void main(String[] args) {
        BankAccount account = new SavingsAccount("Sai", 1000);
        account.deposit(500);
        account.showBalance();
    }
}