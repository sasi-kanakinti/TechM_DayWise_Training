import java.util.Scanner;
public class DiscCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cart value: ");
        double cartValue = sc.nextDouble();
        double finalPrice = calculateFinalPrice(cartValue);
        System.out.println("Final price after discount: $" + finalPrice);
        sc.close();
    }
    public static double calculateFinalPrice(double cartValue) {
        if (cartValue > 500) {
            return cartValue * 0.8;
        } else if (cartValue >= 100) {
            return cartValue * 0.9;
        } else {
            return cartValue;
        }
    }
}