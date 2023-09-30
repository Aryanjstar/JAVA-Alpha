import java.util.Scanner;

public class p1avg {

    public static double avg(double a, double b, double c){
        return (a+b+c)/3;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        double a = sc.nextDouble();
        System.out.print("Enter 2nd Number: ");
        double b = sc.nextDouble();
        System.out.print("Enter 3rd Number: ");
        double c = sc.nextDouble();

        System.out.print("Average of The Numbers: " + avg(a,b,c));
    
    }
    
}
