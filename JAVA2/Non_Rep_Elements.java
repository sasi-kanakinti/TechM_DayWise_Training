import java.util.Scanner;
public class Non_Rep_Elements {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] freq = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (freq[arr[i]] == 1) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}
