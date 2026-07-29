package Array;
import java.util.Scanner;

public class BinaryNextGreat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the number: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want serach");
        int k = sc.nextInt();
        int low = 0;
        int high = arr.length-1;
        int result = -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(k < arr[mid]) {
                result = arr[mid];
               high = mid -1;

            } else {
                low = mid + 1;
            }
        }
        if(result != -1) {
            System.out.println(" next number is grater than array is: " + result);
            
        } else {
            System.out.println("Element not found");

        }
        
    
    }
    
}
