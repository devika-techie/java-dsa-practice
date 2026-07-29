package Array;
import java.util.*;

public class Linerserach1 {
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

        boolean result =linerSearch(arr, key);

        if(result) {
            System.out.println("Element is found at the index:" + result);

        } else{
            System.out.println("Element is not found");
        }
       

        int results =linearserch2(arr, key);
        if (results >= 0) {
            System.out.println("Element is found at the index:" + results);
            
        } else {
            System.out.println("Element is not found");
        }
       

        linearserch3(arr, key);

        

    }
    public static boolean linerSearch(int[] arr, int key) {
        for(int i = 0; i < arr.length; i++) {
            if(key == arr[i]) {
                return true;
            }
        } 
        return false;

    }
    public static int linearserch2(int[] arr, int key) {
        for(int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
                
            }
        }
        return -1;

    }

    public static void linearserch3(int[] arr, int key) {
        for(int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println("Element is found at the index:" +i);
                return;
                
            }
        }
        System.out.println("Element is not found");

    }
    
}
