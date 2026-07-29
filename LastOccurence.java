package Array;

import java.util.Scanner;

public class LastOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the number: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to find");
        int k = sc.nextInt();
        for(int i = arr.length-1; i >= 0; i--) {
            if(arr[i] == k) {
                System.out.println("last occurence is: " + i);
                return;
            }
        }
    }
    
}
