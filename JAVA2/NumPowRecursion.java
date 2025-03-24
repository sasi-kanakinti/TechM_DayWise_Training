import java.util.Scanner;
public class NumPowRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Enter the power: ");
        int pow = sc.nextInt();
        System.out.println(num + " raised to the power " + pow + " is: " + power(num, pow));
        sc.close();
    }
    public static int power(int num, int pow) {
        if (pow == 0) {
            return 1;
        } else {
            return num * power(num, pow - 1);
        }
    }
}
