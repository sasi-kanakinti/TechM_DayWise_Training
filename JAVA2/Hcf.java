import java.util.Scanner;
public class Hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf = calculateHcf(a, b);
        System.out.println("HCF of " + a + " and " + b + " is: " + hcf);
        sc.close();
        }
    public static int calculateHcf(int a, int b) {
        if (b == 0) {
            return a;
        } 
        else {
            return calculateHcf(b, a % b);
        }
    }

}
