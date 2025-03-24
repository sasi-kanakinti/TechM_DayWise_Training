import java.util.Scanner;
public class factorialRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n Value: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is: " + factorial(n));
        sc.close();
    }

    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
