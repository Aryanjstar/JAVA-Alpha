import java.util.*;

public class calculator{
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter 2 Numbers: ");
double a = sc.nextDouble();
double b = sc.nextDouble();
System.out.println("1: Addition");
System.out.println("2: Subtraction");
System.out.println("3: Multiplication");
System.out.println("4: Division");
System.out.println("5: Modulo(Remainder)");
System.out.println("Enter The Operation You Wanna Do: ");

int c = sc.nextInt();

switch(c){
    case 1: System.out.print("Addition Is: " + (a+b));
    break;
    case 2: System.out.print("Subtraction Is: " + (a-b));
    break;
    case 3: System.out.print("Multiplication Is: " + (a*b));
    break;
    case 4: System.out.print("Division Is: " + (a/b));
    break;
    case 5: System.out.print("Remainder Is: " + (a%b));
    break;

    default: System.out.print(" Wrong Input ");
    
}
    }
}