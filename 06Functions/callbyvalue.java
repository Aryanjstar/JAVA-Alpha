

public class callbyvalue {
    public static void change(int a){
        System.out.println("Value of a In New Function: " + a);
        a = 5;
        System.out.println("Value of a In New Function: " + a);
    }    
    public static void main(String [] args){
        int a = 10;
        change(a);
        System.out.println("Value of a In Main Function: " + a);
    }
}
