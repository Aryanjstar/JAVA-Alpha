import java.util.*;

public class funcoverdata {

    public static int sum(int a, int b){
        int  sum = a+b;
        return sum;

    }
        public static float sum(float a, float b){
        float  sum = a+b;
        return sum;

    }

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int sum = sum(a,b);
        System.out.println("Sum = " + sum(a,b));
         
        System.out.println("Sum = " + (sum(2.8f,3.1f)));
        
    }
}
