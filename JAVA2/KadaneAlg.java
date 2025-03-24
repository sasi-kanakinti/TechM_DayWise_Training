public class KadaneAlg {
    
    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum sum of subarray: " + maxSubArraySum(arr));
    }
    public static int maxSubArraySum(int[] arr) {
        int n = arr.length;
        int maxSum = arr[0];
        int currSum = arr[0];
        for (int i = 1; i < n; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
