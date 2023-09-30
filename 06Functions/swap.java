

public class swap {
    public static void swap(int a, int b){
        
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped Value of A is: " + a);
        System.out.println("Swapped Value of B is: " + b);
        return ;
    }    
    public static void main(String [] args){
        int a = 10;
        int b = 5;
        swap(a,b);
        swap(28,31);
        

    }
}
