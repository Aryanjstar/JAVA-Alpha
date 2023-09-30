import java.util.Scanner;

public class scan {
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine(); // next line adjusts space thing also
    System.out.println(name);
    int x = sc.nextInt();
    System.out.println(x);

    double y = sc.nextDouble();
    System.out.println(y);
  }    
}
