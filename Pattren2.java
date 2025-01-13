// Lecture: 5.2 - Patterns (Hollow Rectangle)

public class Pattren2 {
    public static void main(String[] args) {
        int n = 4;

        // Outer loop for number of rows
        for (int i = 1; i <= 4; i++) {
            
            // Inner Loop for number of columns
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


// Output:
// * * * * *
// *       *
// *       *
// * * * * *


// Explanation:
/*  
    In this program, we have to print a hollow rectangle pattern.
    We have taken n = 4, which means the rectangle will have 4 rows and 5 columns.
    We have used two loops, the outer loop for the number of rows and the inner loop for the number of columns.
    We have used an if-else statement to check if the current row or column is the first or last row or column. 
    If it is, then we print a star, else we print a space. 
    This way, we get the hollow rectangle pattern. 
*/