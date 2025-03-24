public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
 
        while (left <= right) {
            int mid = left + (right - left) / 2;
 
            if (arr[mid] == target)
                return mid; // Target found
 
            if (arr[mid] < target)
                left = mid + 1; // Search right half
            else
                right = mid - 1; // Search left half
        }
 
        return -1; // Element not found
    }
 
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72};
        int target = 16;
        int result = binarySearch(arr, target);
 
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}