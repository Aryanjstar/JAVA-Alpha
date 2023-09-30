public class charpattern {
    public static void main(String a[]){
        char ch = 'A';
        for(int i=1; i<=4; i++){ // i is lines
            for(int j=1; j<=i; j++){ // j is char
                System.out.print(ch);
                ch++;
            }
            System.out.print("\n");
        }
    }
}
// if n>26 toh ascii char print hongein
