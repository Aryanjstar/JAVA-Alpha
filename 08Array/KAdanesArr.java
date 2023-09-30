import java.util.Scanner;

public class KAdanesArr {

    public static void KAdanesArr(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0; i<numbers.length; i++){
            cs = cs+numbers[i];
            if(cs<0){
                cs = 0;
            }
            ms = Integer.max(cs, ms);
        
        }
        System.out.println("Maximun SubArr Sum Is: " + ms);
    }

    public static void main(String args[]){
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        KAdanesArr(numbers);
    }
    
}
