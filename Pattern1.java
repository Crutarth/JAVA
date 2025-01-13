// Lecture: 5.1 - Patterns (Solid Rectangle)

public class Pattern1 {
    public static void main(String[] args) {
        int n = 4;

        // Outer loop for number of rows
        for (int i = 1; i <= n; i++) {

            // Inner loop for number of columns
            for (int j = 1; j <= n+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}

// Output:
// * * * * *
// * * * * *
// * * * * *
// * * * * *