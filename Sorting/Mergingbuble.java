package Array.Sorting;
import java.util.*;

public class Mergingbuble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st String");
        String s1 = sc.nextLine().trim();

        System.out.println("Enter your 2nd String");
        String s2 = sc.nextLine().trim();
        
        s1 = s1.replaceAll("[\\[\\],]", "");

        s2 = s2.replaceAll("[\\[\\],]", "");

        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");

        int[] arr = new int[str1.length + str2.length];

        int j = 0;
        for(int i = 0; i < str1.length; i++) {
            arr[j] = Integer.parseInt(str1[i]);
            j++;
        }

        for(int i = 0; i < str2.length; i++) {
            arr[j] = Integer.parseInt(str2[i]);
            j++;
        }

        for(int i = 0 ; i < arr.length-1; i++) {
            for (j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
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
