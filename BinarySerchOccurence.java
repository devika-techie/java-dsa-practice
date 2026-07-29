package Array;

import java.util.Scanner;

public class BinarySerchOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the number: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want to search:");
        int key = sc.nextInt();
        int low = 0;
        int high = arr.length-1;
        int occurence = -1;
        while(low <= high) {
            int mid = (low + high)/2;
            if(key == arr[mid]) {
                occurence = mid;
                high = mid -1;
            } else if(key <= arr[mid]) {
                high = mid - 1;
            } else {
                low =  mid + 1;
            }

        }
        if(occurence != -1) {
            System.out.println("first occurence: " + occurence);
            
        } else {
            System.out.println("Element not found");

        }
      
    }
    
}
