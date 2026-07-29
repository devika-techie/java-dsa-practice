package Array;
import java.util.*;

public class LinerSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the number of elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key element: ");
        int key = sc.nextInt();
    
        for(int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println("The key is found at the index of " + i);
                return;

                
            }
                 
            
        }
        System.out.println("The key is not found");


        
    }
    
}
