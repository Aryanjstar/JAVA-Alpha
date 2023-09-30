import java.util.*;

public class print1ToN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value of N: ");
        int N = sc.nextInt();
        int i = 1;
    while(i<=N){
        System.out.println(i);
        i++;
    }
    }
}
