package Array;
import java.util.*;

public class Merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // first string
        System.out.println("Enter the 1st string");
        String[] s1 = sc.nextLine().split(" ");
        int[] arr1 = new int[s1.length];
        for(int  i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(s1[i]);
        }

        // second String
        System.out.println("Enter the 2nd string");
        String[] s2 = sc.nextLine().split(" ");
        int[]arr2 = new int[s2.length];
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(s2[i]);
        }

        // merging

        int[] merged = new int[s1.length + s2.length];
        for(int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        for(int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }
        System.out.print("Merged Array: [");
        for(int i = 0; i < merged.length; i++) {
            System.out.print(merged[i]);
            if(i < merged.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

       // minimum and maximum value
       int min = merged[0];
       int max = merged[0];
       for(int i = 0; i < merged.length; i++) {
            if( merged[i] < min) {
                min = merged[i]; 
            
             }if ( merged[i] > max) {
                max = merged[i]; 
            
            }

       }
       System.out.println("Minimum element:" + min);
       System.out.println("Maximum element:" + max);
        
    }
    
}
