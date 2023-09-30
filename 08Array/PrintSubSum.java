import java.util.Scanner;

public class PrintSubSum {

    public static void PrintSub(int numbers[]) {
        int ts = 0;
        int sum = 0;
        int MaxSum = Integer.MIN_VALUE;
        int MinSum = 2;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) { // printing
                    sum = sum + numbers[k];
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();

                if (MaxSum < sum) {
                    MaxSum = sum;
                }
                if (MinSum > sum) {
                    MinSum = sum;
                }
                System.out.print("Sum of this subarray is: " + sum);

                System.out.println();

                ts++;
            }

            System.out.println();
        }
        System.out.println("Total Pairs Are: " + ts);
        System.out.println("Maximum Sum Is: " + MaxSum);
        System.out.println("Minimum Sum Is: " + MinSum);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        PrintSub(numbers);
    }

}
