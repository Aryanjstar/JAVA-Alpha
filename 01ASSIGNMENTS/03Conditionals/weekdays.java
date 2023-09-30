import java.util.*;

public class weekdays {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter The Number For The Day You Want: ");
    int x = sc.nextInt();

    switch (x) {
        case 1:
            System.out.print("Sunday");
            break;
                case 2:
            System.out.print("Monday");
            break;
                    case 3:
            System.out.print("Tueday");
            break;
                    case 4:
            System.out.print("Wednesday");
            break;
                    case 5:
            System.out.print("Thursday");
            break;
                    case 6:
            System.out.print("Friday");
            break;
                    case 7:
            System.out.print("Saturday");
            break;
        default:         
            System.out.print("Incorrect Input");
            
    }
}
}
