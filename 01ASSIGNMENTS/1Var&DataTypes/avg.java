import java.util.*;

public class avg {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write Three Numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int ans = (x+y+z)/3;
        System.out.print("Average Is: ");
        System.out.println(ans);
    }
}
