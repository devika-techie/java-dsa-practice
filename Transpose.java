package Array;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the rows and columns:");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] arr = new int[row][column];
        int[][] transpose = new int[column][row];

        System.out.println("Enter the number of rows and columns:");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
          
        }

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                transpose[j][i] = arr[i][j];

            }
        }        
        System.out.println("Original arrays:");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ") ;
            }
            System.out.println();   
        }
      

        System.out.println("Transpose arrays:");
        for(int i = 0; i < column; i++) {
            for(int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + " ") ;
            }
            System.out.println();   
        }    
    }
    
}
