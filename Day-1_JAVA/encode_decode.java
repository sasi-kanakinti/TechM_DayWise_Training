import java.util.*;

public class encode_decode {

    static Scanner sc = new Scanner(System.in);

    public static int encode(int n) {
        return n ^ 0x12345678;
    }
    public static int decode(int n) {
        return n ^ 0x12345678;
    }
    public static void main(String[] args) {
        int encoded = encode(sc.nextInt());
        int decoded = decode(encoded);
        System.out.println(decoded);
    }
}