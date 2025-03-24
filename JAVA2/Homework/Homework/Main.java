package Homework;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        System.out.println(minDifference(arr, n, m));
        sc.close();
    }
    public static int minDifference(int[] arr, int n, int m) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i<n-m;i++){
            minDiff = Math.min(minDiff, arr[i+m-1] - arr[i]);
        }
        return minDiff;
    }
}