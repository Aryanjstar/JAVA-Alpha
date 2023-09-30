public class HollowRect {

    public static void Hollow_Rect(int trows, int tcols) {
        // outer loop
        for (int i = 1; i <= trows; i++) {
            // inner loop - columns
            for (int j = 1; j <= tcols; j++) {
                // cell - (i,j)
                if (i == 1 || i == trows || j == 1 || j == tcols) {
                    // boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Hollow_Rect(3, 5);
    }

}
