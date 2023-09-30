public class InvertedRotatedHalfPyramidWithNo {

    public static void InvertedRotatedHalfPyramid(int n){
        // outer loop
        for(int i=1; i<=n; i++){
            // inner loop - columns
            for(int j=1; j<=n-i+1; j++){
                // cell - (i,j)
                System.out.print(j);
            }  
            System.out.println();
        }
    }
    

    public static void main(String args[]){
        InvertedRotatedHalfPyramid(5);
    }
    
}
