package Array;

import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the size of the array:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("how many number you want to be rotated");
        int k = sc.nextInt();
        if (k > n) {
            k = k % n;
            
        }
        
        int start = 0; 
        int end = k-1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end--;

        }

         start = k;
         end = n- 1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end--;

        }

        start = 0;
        end  = n-1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end--;
    
        }
        System.out.print("[");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if(i < arr.length-1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
            

    }
    
}
