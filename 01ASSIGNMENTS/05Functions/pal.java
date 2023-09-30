import java.util.Scanner;

public class pal {
    
    public static boolean isPalindrome(int n){
        int Palindrome =  n;
        int reverse = 0;
        while(Palindrome!=0){
            int remainder = Palindrome%10;
            reverse = reverse*10+remainder;
            Palindrome = Palindrome/10;
        }
        if (n==reverse) {
            return true;
        } 
            return false;
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int Palindrome = sc.nextInt();
        if (isPalindrome(Palindrome)) {
            System.out.print("Number Is A Palindrome");
        } else {
            System.out.print("Number Is Not A Palindrome");
        }
    }
}
