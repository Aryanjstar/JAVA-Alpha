import java.util.Scanner;

public class p4SumofDig {

    public static int sumd(int n){
        int sum = 0;
        int myno = n;
        while(n!=0){
            myno = n%10;
            sum = sum+myno;
            n = n/10;
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Sum of the number " + n + " is: " + sumd(n));
    }
    
}
