package Array;

import java.util.Scanner;

public class Array2d {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the row");
        int row = sc.nextInt();
        System.out.println("Enter the size of the column");
        int column = sc.nextInt();
        int[][] arr = new int[row][column];
        System.out.println("Enter the number of rows and columns");
        for(int i = 0; i < arr.length; i++) {
            for(int j =0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }  
        }
        System.out.println("Array:");
        for(int i = 0; i < arr.length; i++) {
            for(int j =0; j < arr[i].length; j++) {
               System.out.print(arr[i][j] + " " );
            } 
            System.out.println(); 
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i][0];
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
            System.out.println("minimum row of " + (i+1) + " is: "+  min);
            sum = sum + min;
        }
        System.out.println("Sum of the element is: "+ sum);

        


    }
}
