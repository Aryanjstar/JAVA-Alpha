public class typeprom {

    public static void main(String args[]){
        short x = 5;
        char y = 'a';
        byte z = 5;
        int a = (x+y+z); // each variables in rhs converted into int 
        System.out.println(a);
        System.out.println(y);
        System.out.println((int)(y));

        int l = 50;
        double m = 14;
        float n = 41; //41.00f for taking it as float value
        long o = 85;
        double p = (l+m+n+o);
        System.out.println(p);

        byte q = 5;
        q = (byte)(q*2);
        System.out.println(q); // since it do prom so we have to typecast , typecasted int into byte
    }
    
}

