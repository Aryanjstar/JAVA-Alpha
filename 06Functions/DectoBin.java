// import java.util.Scanner;

public class DectoBin {

    public static void DecToBin(int Decimal){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Binary Number: ");
        // BinNum = sc.nextInt();
        int BinNum = 0;
        int pow = 0;
        int MyNo = Decimal;

        while(Decimal>0){
            int Remainder = Decimal % 2; // remainder
            BinNum =  BinNum + (Remainder*(int)Math.pow(10, pow));
            pow++;
            Decimal = Decimal/2; //quotient
        }
        System.out.println("binary form of " + MyNo + " = " + BinNum);
    }
    public static void main(String args[]){
        DecToBin(101);
    }
}
