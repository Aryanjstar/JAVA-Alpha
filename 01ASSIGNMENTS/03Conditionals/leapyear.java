import java.util.*;

public class leapyear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int x = sc.nextInt();

        if(((x%4)==0) || ((x%100)==0) || ((x%400)==0) )
        System.out.print("Not A Leap Year");
        else System.out.print("A Leap Year");

        }
    
}
