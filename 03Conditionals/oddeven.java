import java.util.*;

public class oddeven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Write The No.: ");
        int x = sc.nextInt();
        
        
        if(x%2==0){
           System.out.print("Even");
        }
        else{
            System.out.print("Odd");
        }
    }    
}
