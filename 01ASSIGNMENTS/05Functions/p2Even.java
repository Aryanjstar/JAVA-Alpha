import java.util.Scanner;

public class p2Even {
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if(isEven(n)){
             System.out.print("Number Is Even");
        }
        else{
            System.out.print("Number Is Odd");
        }
       
    }
}