import java.util.Scanner;

public class powerOf2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isPowerOfTwo(number))
        {
            System.out.println("Yes, it is a power of two");
        }
        else
        {
            System.out.println("No, it is not a power of two");
        }
        scanner.close();
    }
    public static boolean isPowerOfTwo(int number)
    {
        return (number & (number - 1)) == 0;
    }
}