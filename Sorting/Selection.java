package Array.Sorting;
import java.util.*;

public class Selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1 =  sc.nextLine().trim();
        s1 = s1.replaceAll("[\\[\\],]", "");
        String str[] = s1.split(" ");
        int[] arr = new int[str.length];
        for(int i = 0 ; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]); 
        }
        for(int i = 0; i < arr.length-1; i++) {
            int max = arr[i];
            int pos = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] > max) {
                    max = arr[j];
                    pos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
        System.out.print("[");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i < arr.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");    


        
    }
    
}
