public class bin {

    public static int fact(int n){
                    int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static int bin(int n, int r){
        // int factn = 1;
        // for(int i = 1; i<=n; i++){
        //     factn = factn*i;
        // }
        // int factr = 1;
        // for(int i = 1; i<=r; i++){
        //     factr = factr*i;
        // }
        // int factnr = 1;
        // for(int i = 1; i<=(n-r); i++){
        //     factnr = factnr*i;
        // }

        int factn = fact(n);
        int factr = fact(r);
        int factnr = fact(n-r);

        int bincoe = factn/((factnr)*(factr));
        return bincoe;
    }

    public static void main(String [ ]args){
        int n = 5;
        int r = 2;
        System.out.println("Binomial Coe Is: " + bin(n,r));
        System.out.println((bin(5,1)));
        
    }
    
}
