import java.util.Scanner;
public class reversedBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int reversedBinary = reverseBits(num);
        System.out.println("Reversed binary: " + Integer.toBinaryString(reversedBinary));
        System.out.println("Equivalent decimal: " + reversedBinary);
        sc.close();
        }
    public static int reverseBits(int num) {
        int reversedBinary = 0;
        for (int i = 0; i < 32; i++) {
            reversedBinary = reversedBinary << 1;
            reversedBinary = reversedBinary | (num & 1);
            num = num >> 1;
        }
        return reversedBinary;
    }
}