package Array;
import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String input = sc.nextLine();
        String[] values = input.split(" ");

        int evenSum = 0;
        int oddSum = 0;
        for(int i = 0; i < values.length; i++) {
            int num =Integer.parseInt(values[i]);
            if(num % 2 == 0) {
                evenSum += num;
            } else if(num % 2 != 0) {
                oddSum += num;
            }
            
        }
        System.out.println("EvenSum: " + evenSum);
        System.out.println("OddSum: " + oddSum);

    }
    
}
