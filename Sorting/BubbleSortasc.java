package Array.Sorting;
import java.util.Scanner;
public class BubbleSortasc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the number:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array before sort:[");
        for(int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length-1) {
                System.out.print(", ");
                
            }
        }
        System.out.println("]");

        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


        System.out.print("Array after sort:[");
        for(int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length-1) {
                System.out.print(", ");
                
            }
        }
        System.out.println("]");


    }
    
}
