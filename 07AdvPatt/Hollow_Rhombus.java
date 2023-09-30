public class Hollow_Rhombus {

    public static void Hollow_Rhombus(int n) {
        // outer loop

        // spaces
            for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n-i); j++) {

                System.out.print(" ");
            }

        //Hollow Rectangle - Stars

        for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Hollow_Rhombus(5);
    }

}
