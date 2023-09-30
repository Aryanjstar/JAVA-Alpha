import java.util.*;
public class largestof3 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Write Three Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.print("a is largest: " + a);
        }

        else if(b>a && b>c){
            System.out.print("b is largest: " + b);
        }
        else
        System.out.print("c is largest: " + c);
    }    
}
