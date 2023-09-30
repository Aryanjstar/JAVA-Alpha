import java.util.*;

public class primeornot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        for(int i=2; i<n; i++){
            if(n%2==0){
                System.out.print("Number Is Not Prime");
            }
            else{
            System.out.print("Number Is Prime");
        }
            break;
        }



    }

    }