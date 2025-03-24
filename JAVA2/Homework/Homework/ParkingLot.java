package Homework;

import java.util.*;
public class ParkingLot {
    public static int maxCars(int n, char[] arr) {
        int maxCars = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == 'S'){
                count++;
            }else{
                maxCars = Math.max(maxCars, count);
                count = 0;
            }
        }
        maxCars = Math.max(maxCars, count);
        return maxCars;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char arr[] = new char[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next().charAt(0);
            sc.nextLine();
        }
        sc.close();
        System.out.println(maxCars(n, arr));
    }
}