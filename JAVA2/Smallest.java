public class Smallest {
    public static void main(String[] args) {
        int a[] = {10, 20, 5, 45, 67, 33};
        if (a.length == 0) {
            System.out.println("Array is empty!");
            return;
        }
 
        int small = a[0];
        int big = a[0];
 
        for (int i = 1; i < a.length; i++) {  
            if (a[i] < small) {
                small = a[i];
            }
            if (a[i] > big) {
                big = a[i];
            }
        }
 
        System.out.println("Smallest num is: " + small);
        System.out.println("Largest num is: " + big);
    }
}