import java.util.*;

public class sumoffirstnno {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        int sum = 0;
        int counter = 0;
        while(n!=0){
            counter = n%10;
            sum = sum+counter;
            n = n/10;
        }
        

        System.out.print("Sum Is: " + sum);
    }
}
