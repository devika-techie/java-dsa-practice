package Array;
import java.util.*;

public class Rotate2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the number:");
        for(int i = 0; i < arr.length; i++) {
             arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number of element to be rotated");
        int k = sc.nextInt();
        rotate(arr, k) ;
        System.out.println(Arrays.toString(arr));
    } 
    
    public static void reverse(int[] arr, int start , int end)  {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;  
        }

    }
    public static void rotate(int[] arr, int k) {

        int n = arr.length;

        if(k > n) {
            k = k % n;

        }
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);

    }
    
}
