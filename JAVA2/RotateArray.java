import java.util.*;

public class RotateArray {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt(); // Rotate by 3 positions
        rotateArray(arr, k);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
        sc.close();
    }
 
    public static void rotateArray(int[] arr, int k) 
    {
        int n = arr.length;
        k = k % n; // Handle cases where k > n
        reverse(arr, 0, n - 1);       // Reverse the entire array
        reverse(arr, 0, k - 1);       // Reverse first k elements
        reverse(arr, k, n - 1);       // Reverse remaining elements
    }
 
    public static void reverse(int[] arr, int start, int end) 
    {
        while (start < end) 
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}