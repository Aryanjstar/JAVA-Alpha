public class a01Triangle {

    public static void a01Triangle (int n){
  
        // outer loop
        for(int i=1; i<=n; i++){
            // inner loop - columns
            for(int j=1; j<=i; j++){
                // cell - (i,j)
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
                
            
            }  
            System.out.println();
        }
    }
    

    public static void main(String args[]){
        a01Triangle(5);
    }
    
}
