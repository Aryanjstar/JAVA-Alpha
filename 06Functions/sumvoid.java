import java.util.*;

public class sumvoid {

    public static void sum(int a, int b){
        int  sum = a+b;
        System.out.println("Sum = " + sum);

    }

    
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a,b);
    }
}
