import java.util.Scanner;

public class FibonacciSeries
 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci series:");
        int a = 0, b = 1, c;
        for(int i = 1; i <= n; i++)
        {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        scanner.close();
    }
}