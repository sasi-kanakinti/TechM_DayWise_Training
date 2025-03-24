import java.util.*;
import java.io.*;   
import java.math.*;
@SuppressWarnings("unused")
public class BirdNest
{
    static long minDist(int[] x, int n)
    {
        Arrays.sort(x);
        long low = 0, high = x[n - 1] - x[0];
        long ans = -1;
        while (low <= high) {
            long mid = (low + high) / 2;
            if (isPossible(x, n, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
    static boolean isPossible(int[] x, int n, long d)
    {
        int birds = 1;
        int last = x[0];
        for (int i = 1; i < n; i++) {
            if (x[i] - last >= d) {
                birds++;
                last = x[i];
            }
        }
        return birds >= 3;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        System.out.println(minDist(x, n));
        sc.close();
    }
}
