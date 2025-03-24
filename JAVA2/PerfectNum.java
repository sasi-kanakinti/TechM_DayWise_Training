import java.util.Scanner;
 
public class PerfectNum {
    public static boolean isPerfect(int num) {
        if (num < 2) return false; // Perfect numbers start from 6
        int sum = 0;
        // Find divisors and sum them up
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a Perfect Number: ");
        int num = scanner.nextInt();
        scanner.close();
 
        if (isPerfect(num)) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is NOT a Perfect Number.");
        }
    }
}