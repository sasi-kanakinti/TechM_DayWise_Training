import java.util.Scanner;
public class Amstrong {
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int numDigits = String.valueOf(num).length(); // Count number of digits
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits); // Raise digit to the power of total digits
            num /= 10;
        }
        return sum == originalNum;
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstrong Number: ");
        int num = scanner.nextInt();
        scanner.close();
 
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong Number.");
        } else {
            System.out.println(num + " is NOT an Armstrong Number.");
        }
        scanner.close();
    }
}
