package Array.Sorting;
import java.util.*;

public class SelectionSortdesc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the number:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Before swaping the array: [");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length-1) {
                System.out.print(", ");
                
            }
        }
        System.out.println("]");

        for(int i = 0; i < arr.length-1; i++) {
            int max = arr[i];
            int pos = i;
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    pos = j;

                    
                }
            }
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }

        System.out.print("After swaping the array: [");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length-1) {
                System.out.print(", ");
                
            }
        }
        System.out.println("]");

    }
    
}
