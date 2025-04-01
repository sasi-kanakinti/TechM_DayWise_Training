import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    private double balance;
    private Lock lock = new ReentrantLock();

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void transfer(BankAccount target, double amount) {
        lock.lock();
        try {
            if (balance >= amount) {
                balance -= amount;
                target.balance += amount;
                System.out.println("Transfer successful");
            }
        } finally {
            lock.unlock();
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1000);
        BankAccount acc2 = new BankAccount(1000);
        acc1.transfer(acc2, 500);
    }
}
