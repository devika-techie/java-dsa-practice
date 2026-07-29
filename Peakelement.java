package Array;
import java.util.Scanner;

public class Peakelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // check first elements
        if(arr.length == 1) {
                System.out.println(0);
                return;
        }
        // check first element
        if(arr[0] > arr[1]) {
            System.out.println(0);
            return;

        }

        // check mid element
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                    System.out.println(i);
                    return;
            }
           
        }
         // last element 
         if(arr[arr.length-1] > arr[arr.length-2]) {
            System.out.println(arr.length-1);
            return;
         }
         
    }
    
}
