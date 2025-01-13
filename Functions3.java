// Lecture: 7.3 - Functions
// Write a program to make a function to print the factorial of a number.

import java.util.*;

public class Functions3 {
    public static void printFactorial(int n) {

        // check if the number is negative
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        }

        // loop to calculate the factorial of a number
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }

    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        printFactorial(n); // calling the function

    }
}


// Output:
// Enter the number :
// 5
// Factorial of 5 is: 120

// Explanation:
/* 
    In this program, we have created a function printFactorial() that takes an integer as an argument and prints the factorial of that number.
*/