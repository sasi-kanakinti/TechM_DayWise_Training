import java.util.Scanner;
public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: "); 
        String text = sc.nextLine();
        char[] charArray = text.toCharArray();
        int[] frequency = new int[256];
        for (char c : charArray) {
            frequency[c]++;
        }
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i]!=0) {
                System.out.println((char)i + ": " + frequency[i]);
            }
        }
        sc.close();
    }
}
