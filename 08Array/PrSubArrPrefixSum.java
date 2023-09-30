import java.util.Scanner;

public class PrSubArrPrefixSum {

    public static void PrintSubMax(int numbers[]) {
        int ts = 0;
        int CurrSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        // calculate prefix array
        for(int i=1; i<numbers.length; i++){
            prefix[i] = prefix[i-1]+numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                
                CurrSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];  

                

                if (MaxSum < CurrSum) {
                    MaxSum = CurrSum;
                }
                 
                System.out.print("Sum of this subarray is: " + CurrSum);

                System.out.println();
                
                ts++;
            }

            System.out.println();
        }
        System.out.println("Total Pairs Are: " + ts);
        System.out.println("Maximum Sum Is: " + MaxSum);
        
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        PrintSubMax(numbers);
    }

}
