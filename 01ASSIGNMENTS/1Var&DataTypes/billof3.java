import java.util.*;

public class billof3 {
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Price of The Pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("Enter The Price of The Pen: ");
        float pen = sc.nextFloat();
        System.out.print("Enter The Price of The Eraser: ");
        float eraser = sc.nextFloat();
        
        float bill = (float)(pencil+pen+eraser);
        System.out.print("Bill Is: ");
        System.out.print(bill);
 
    }
}
