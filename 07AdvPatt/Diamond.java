public class Diamond {

    public static void Diamond(int n) {

        // outer loop
        for (int i = 1; i <= n; i++) {

   

            for (int j = 1; j <= ((n - i)); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= ((2*i)-1); j++) {

                System.out.print("*");
            }

            System.out.println();

        }

        // 2nd half
             // outer loop
        for (int i = n; i >= 1; i--) {

   

            for (int j = 1; j <= ((n - i)); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= ((2*i)-1); j++) {

                System.out.print("*");
            }

            System.out.println();
        }
        }


    public static void main(String args[]) {
        Diamond(10);
    }

}
