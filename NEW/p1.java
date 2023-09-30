import java.util.Scanner;

public class p1 {
    public static char findMaxOccurringCharacter(String input) {
        
        int[] frequency = new int[256];

        // Initialize the frequency array with zeros
        for (int i = 0; i < input.length(); i++) {
            frequency[input.charAt(i)]++;
        }

        char maxChar = '\0';
        int maxCount = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > maxCount) {
                maxCount = frequency[i];
                maxChar = (char) i;
            }
        }

        return maxChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        char result = findMaxOccurringCharacter(input);
        System.out.println("Maximum occurring character: " + result);
    }
}
