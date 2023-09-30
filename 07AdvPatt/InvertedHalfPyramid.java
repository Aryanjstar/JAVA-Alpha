public class InvertedHalfPyramid {

    public static void InvertedRotatedHalfPyramid(int n){
        // outer loop
        for(int i=1; i<=n; i++){
            // inner loop - columns
            for(int j=1; j<=n-i; j++){
                // cell - (i,j)
                System.out.print(" ");
            }  
                
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    

    public static void main(String args[]){
        InvertedRotatedHalfPyramid(5);
    }
    
}
