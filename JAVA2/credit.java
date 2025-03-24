import java.util.*;
interface Payment {
    void pay(double amount); // Abstract method (no body)
}
 
class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using UPI.");
    }
}
 
class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}
 
public class credit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        Payment payment1 = new UPI();
        payment1.pay(money);
 
        Payment payment2 = new CreditCard();
        payment2.pay(500);
        sc.close();
    }
}