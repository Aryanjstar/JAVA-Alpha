import java.util.*;

public class halfpyramid {
  
    public static void main(String args[]){
          int n = 7;
        for(int i=1; i<=4; i++){ // outer loop 4x -  no of lines
            for(int j=1; j<=i; j++){ // number is printed <= lines, j is number
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
