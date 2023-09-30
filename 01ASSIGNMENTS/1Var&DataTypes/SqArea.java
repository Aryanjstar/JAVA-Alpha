import java.util.*;

public class SqArea {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Length of The Side: ");
        float x = sc.nextFloat();
        float y = (float) (x*x);
        System.out.print("Area of Square Is: ");
        System.out.println(y);
    }
}