public class fact {

    public static int fact(int a){
                    int fact = 1;
        for(int i = 1; i<=a; i++){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String [ ]args){
        int a = 5;
        System.out.println("Factorial of " + a + " is: " + fact(a));
        System.out.println((fact(31)));
        
    }
    
}
