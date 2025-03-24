import java.util.*;
public class PRIMEMAGIC
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 3; i <= n; i++) {
            if(isPrime(i)) {
                if(isSumOfConsecutivePrimes(i)) {
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
    
    public static boolean isPrime(int n) {
        if(n == 2) {
            return true;
        }
        if(n % 2 == 0) {
            return false;
        }
        for(int i = 3; i <= Math.sqrt(n); i += 2) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isSumOfConsecutivePrimes(int n) {
        int sum = 0;
        @SuppressWarnings("unused")
        int count = 0;
        for(int i = 2; i <= n; i++) {
            if(isPrime(i)) {
                sum += i;
                count++;
                if(sum == n) {
                    return true;
                }
                if(sum > n) {
                    return false;
                }
            }
        }
        return false;
    }
}