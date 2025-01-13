// Lecture: 7.4 - Factorial
// Write a program to print the factorial of a number using a function.

import java.util.*;

public class Factorial {

    public static void main(String[] args) {
        int factorial = 1, n;

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = n; i >= 1; i--) { 
            factorial = factorial * i; 
            System.out.println("Factorial of " + i + " is: " + factorial);
        }
    }
}


// Output:
// Enter the number:
// 5
// Factorial of 5 is: 5
// Factorial of 4 is: 20
// Factorial of 3 is: 60
// Factorial of 2 is: 120
// Factorial of 1 is: 120

// Explanation:
// In this program, we have calculated the factorial of a number using a for loop.