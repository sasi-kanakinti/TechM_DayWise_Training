import java.util.*;

public class TypePromotion {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        char b = sc.next().charAt(0);
        double c = sc.nextDouble();
        System.out.println("Result of (a + b * c) = " + (a + b * c));
    }
}