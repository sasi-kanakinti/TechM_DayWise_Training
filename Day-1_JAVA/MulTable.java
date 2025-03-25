import java.util.Scanner;
public class MulTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, start, end;
        char choice;
        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            System.out.print("Enter the start of the range (default is 1): ");
            start = scanner.nextInt();
            System.out.print("Enter the end of the range (default is 10): ");
            end = scanner.nextInt();
            System.out.println("Using for loop:");
            for (int i = start; i <= end; i++) {
                System.out.println(number + " x " + i + " = " + number * i);
            }
            System.out.println("Using while loop:");
            int i = start;
            while (i <= end) {
                System.out.println(number + " x " + i + " = " + number * i);
                i++;
            }
            System.out.println("Using do-while loop:");
            i = start;
            do {
                System.out.println(number + " x " + i + " = " + number * i);
                i++;
            } while (i <= end);
            System.out.println("Using for loop in reverse order:");
            for (int j = end; j >= start; j--) {
                System.out.println(number + " x " + j + " = " + number * j);
            }
            System.out.print("Do you want to generate another table? (Y/N): ");
            choice = scanner.next().charAt(0);
        } 
        while (choice == 'Y' || choice == 'y');
        scanner.close();
    }
}