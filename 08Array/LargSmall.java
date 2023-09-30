import java.util.Scanner;

public class LargSmall {

    public static int getLarSma(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }
            if(numbers[i]<smallest){
                smallest = numbers[i];
            }
            
        } 
        System.out.println("Smallest Number Is: " + smallest);
      return largest;
        
        
    }
    public static void main(String args[]){
        int numbers[] = {2,4,5,68,9,75,26,28,31};
        System.out.println("Largest Number Is: " + getLarSma(numbers));
    }
    }

