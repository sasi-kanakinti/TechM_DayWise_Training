import java.util.Scanner;

public class SwapVariable
{
    static Scanner sc=new Scanner(System.in);
    static int a = sc.nextInt(), b = sc.nextInt();
    public static void main(String[] args)
    {
        
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
    
}