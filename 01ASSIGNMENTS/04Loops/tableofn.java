
    import java.util.*;
public class tableofn {

    public static void main(String args[]){
        int fact=1;
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        number = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println((number + "*" + i + "=" + (number*i)));
        }
    
}
}
