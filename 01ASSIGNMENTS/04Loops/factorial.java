import java.util.*;
public class factorial {

    public static void main(String args[]){
        int fact=1;
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        number = sc.nextInt();
        for(int i=1; i<=number; i++){
            fact = fact*i;
        }
        System.out.print("Factorial of The Number "+ number + " is: "+ fact);
    }
    
}
