import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        // Using try-with-resources to automatically close the scanner
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();

            int nsp = n - 1; 
            int nst = 1;

            // Upper Half (including the middle row)
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= nsp; j++) {
                    System.out.print("  "); // Two spaces to match the "* "
                }
                for (int j = 1; j <= nst; j++) {
                    System.out.print("* ");
                }
                nsp--;
                nst += 2;
                System.out.println();
            }

            // Lower Half
            nsp = 1;
            nst = 2 * n - 3; // Start with 2 less than the middle row

            // Change loop to i <= n-1 so the diamond tapers correctly
            for (int i = 1; i <= n - 1; i++) { 
                for (int j = 1; j <= nsp; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= nst; j++) {
                    System.out.print("* ");
                }
                nsp++;
                nst -= 2;
                System.out.println();
            }
        } // Scanner closes automatically here
    }
}