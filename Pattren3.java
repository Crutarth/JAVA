// Lecture: 5.3 - Patterns (Inverted Half Pyramid)

public class Pattren3 {
    public static void main(String[] args) {
        int n = 4;
        // Outer loop for number of rows
        for (int i = n; i >=0; i--) {
            
            // Inner Loop for number of columns
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }   
}


// Output:
// * * * *
// * * *
// * *
// *

// Explanation:
/*  
    In this program, we have to print an inverted half pyramid pattern.
    We have taken n = 4, which means the pyramid will have 4 rows and 4 columns.
    We have used two loops, the outer loop for the number of rows and the inner loop for the number of columns.
    We have used an if-else statement to check if the current row or column is the first or last row or column. 
    If it is, then we print a star, else we print a space. 
    This way, we get the inverted half pyramid pattern. 
*/