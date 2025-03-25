import java.util.*;

class Payment {
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " using default payment method.");
    }
    public void pay(double amount, String method) {
        System.out.println("Paying $" + amount + " using " + method + " payment method.");
    }
    public void pay(double amount, String method, int emiMonths) {
        System.out.println("Paying $" + amount + " using " + method + " EMI for " + emiMonths + " months.");
    }
}

public class Polymorphism {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Payment p = new Payment();
        p.pay(sc.nextDouble());
        p.pay(sc.nextDouble(), sc.nextLine());
        p.pay(sc.nextDouble(), sc.nextLine(), sc.nextInt());
    }
}