// import java.util.Scanner;
// public class NumRev {   
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int num = sc.nextInt();
//         System.out.println("Number Reversed: " + Rev(num));
//                 sc.close(); 
//         }
//     public static int Rev(int num) {
//         int rev = 0;
//         while (num > 0) {
//             rev = (rev * 10) + (num % 10);
//             num /= 10;
//         }
//         return rev;
//     }
// }

import java.util.Scanner;
public class NumRev
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number : ");
String number = sc.nextLine();
StringBuffer s = new StringBuffer(number);
System.out.println(s.reverse());
 sc.close();
}
}