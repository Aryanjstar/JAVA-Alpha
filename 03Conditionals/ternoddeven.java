import java.util.Scanner;

public class ternoddeven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Write The No.: ");
        int x = sc.nextInt();

        String type = ((x%2)==0)?"Even":"Odd";
        System.out.print(type);
    }
}
