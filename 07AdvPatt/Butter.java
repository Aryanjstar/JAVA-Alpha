public class Butter {

    public static void Butter(int n) {

        // outer loop
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }

            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }

            System.out.println();

        }

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }

            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.out.print(" ");
            }
            // inner loop - columns
            for (int j = 1; j <= i; j++) {
                // cell - (i,j)
                System.out.print("*");
            }

            System.out.println();

        }

    }

    public static void main(String args[]) {
        Butter(10);
    }

}
