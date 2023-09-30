import java.util.Scanner;

public class SumevenOdd {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice;
        int number;
        int evenSum=0;
        int oddSum=0;

        do{
            System.out.print("Enter The Number: ");
            number = sc.nextInt();
            if(number%2==0){
                evenSum+=number;
            }
            else{
                oddSum+=number;
            }
            System.out.print("If You Want To Continue Enter 1, Else Enter 0: ");
            choice = sc.nextInt();
        }while(choice==1);

        System.out.println("Sum of Even Numbers Is: "+ evenSum);
        System.out.println("Sum of Odd Numbers Is: "+ oddSum);
    }
    
}
