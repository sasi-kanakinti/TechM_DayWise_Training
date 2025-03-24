import java.util.Scanner;
 
public class PowerOfTwoChecker {
    public static boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
 
        if (isPowerOfTwo(num)) {
            System.out.println(num + " is a power of 2.");
        } else {
            System.out.println(num + " is NOT a power of 2.");
        }
    }
}