package Array;
import java.util.*;
public class BetweenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the number: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
       int first = sc.nextInt();
       int last = sc.nextInt();
       for(int i = 0; i < arr.length; i++) {
        if(first < arr[i] &&  last > arr[i]) {
            System.out.print(arr[i] + " ");
        }
       }
    }
    
}
