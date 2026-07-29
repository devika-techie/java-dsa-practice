package Array;

import java.util.Scanner;

public class ArrayFrq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the number:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }

        boolean[] visited = new boolean[n];

        for(int i = 0; i < arr.length; i++) {
            if(visited[i] == true) {
                continue;
            }

            int count = 1;
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count ++;
  
                }
                
            }
            System.out.println(arr[i] + " " + count);

        }
        
    }
    
}
