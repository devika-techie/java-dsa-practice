package Array.Sorting;

import java.util.Scanner;

public class InsertSortAse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the number:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Before Swap: [");
        for(int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i < arr.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("] ");


        for(int i = 1; i < arr.length; i++) {
            int item = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > item) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = item;
        }
        System.out.print("After Swap: [");
        for(int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i < arr.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("] ");

    }
    
}
