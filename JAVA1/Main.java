import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i = 0 ; i < len ; i++){
            arr[i] = sc.nextInt();
        }
        int k = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] == a) {
                System.out.println("Element is found at index " + i);
                k = 1;
                break;
            }
        }
        if (k == 0) {
            System.out.println("Element is not found in array");
        }
        sc.close();
    }
}