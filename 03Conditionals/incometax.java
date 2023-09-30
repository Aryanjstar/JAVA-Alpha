import java.util.*;

public class incometax {
  
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
             System.out.print("Enter Your Earnings: ");
        Double money = sc.nextDouble();
   
        if(money<500000){
            System.out.println("Total Tax To Be Paid: " + 0);}
        else if(money>=500000 && money<1000000){
            System.out.println("Total Tax To Be Paid: " + ((0.2f)*money));}
        
        else{
            System.out.println("Total Tax To Be Paid: " + ((0.3f)*money));}
        }
}
