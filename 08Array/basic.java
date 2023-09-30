import java.util.Scanner;

public class basic {
    
    public static void main(String args[]){
        int marks[] = new int[50];
        int numbers[] = {1,2,3};
        int moreNumbers[] = {4,5,6};
        String fruits[] = {"apple", "mango", "guavava"};
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("phy: " + marks[0] );
        System.out.println("phy: " + marks[1] );
        System.out.println("phy: " + marks[2] );
        marks[1] = marks[1]+1;
        System.out.println("phy: " + marks[1] );
        System.out.println("Length of the array: " + marks.length );
    }
}
