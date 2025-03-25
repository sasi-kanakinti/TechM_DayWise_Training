import java.util.Scanner;

public class Pattern
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= (rows - i); j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}