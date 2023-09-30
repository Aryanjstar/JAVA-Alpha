import java.util.*;

public class reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        System.out.print("Reversed Number Is: ");

        int counter = 0;
        while(n!=0){
            counter = n%10;
            System.out.print(counter);
            n = n/10;
        }

    }
}