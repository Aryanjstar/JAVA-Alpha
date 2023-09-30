// import java.util.Scanner;

public class BinToDec {

    public static void binToDec(int BinNum){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Binary Number: ");
        // BinNum = sc.nextInt();
        int decNum = 0;
        int pow = 0;
        int MyNo = BinNum;

        while(BinNum>0){
            int lastDigit = BinNum % 10;
            decNum =  decNum + (lastDigit*(int)Math.pow(2, pow));
            pow++;
            BinNum = BinNum/10;
        }
        System.out.println("decimal of " + MyNo + " = " + decNum);
    }
    public static void main(String args[]){
        binToDec(101);
    }
}
