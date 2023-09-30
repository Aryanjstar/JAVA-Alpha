import java.util.Scanner;

public class passfail {
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Write Your Marks: ");
    int marks = sc.nextInt();
    if(marks>=33){
        System.out.print("Pass");
    }
    else{
        System.out.print("Fail");
    }
    }
}
