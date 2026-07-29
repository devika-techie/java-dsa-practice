package Array;
import java.util.*;

public class RemoveElemet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the number:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number u want to delete");
        int value = sc.nextInt();
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != value) {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
