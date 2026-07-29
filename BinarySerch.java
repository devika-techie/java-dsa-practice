package Array;

import java.util.Scanner;

public class BinarySerch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i  = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key to be saerch:");
        int key = sc.nextInt();
        int low = 0; 
        int high = arr.length-1;
        while (low <= high) {
            int mid = (low + high)/2;
            if(key == arr[mid]) {
                System.out.println("Element is found at  " + mid);
                return;
            } else if(key < arr[mid]) {
                high = mid - 1;

            } else {
                low = mid + 1;
            }
            
        }
        System.out.println( "element is not found");

        
    }
    
}
