public class typecasting {

    public static void main(String args[]){
        float a = 25.0f; // 25.0 is considered as double so it can't be equal to float so we have to typecast it
        int b = (int)(a); // typecasted since it can't make float equal to int
        System.out.println(b); // values before decimal will be only printed 
    }
    
}


// typecasting = narrowing = explicit conversion