// Lecture: 8.9 - Fibonacci Series
// Write a program to print the Fibonacci series up to n terms.

import java.util.*;

public class Fibonacci {
    public static void fibonacciSeries(int n) {
        int a = 0, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) { // starting from 2 because 0 and 1 are already printed
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();

        fibonacciSeries(n); // calling the function
    }
}


// Output:
// Enter the number of terms:
// 10
// 0 1 1 2 3 5 8 13 21 34


// Explanation:
/* 
    In this program, we have created a function fibonacciSeries() that takes an integer as an argument and prints the Fibonacci series up to n terms.
    We have called the fibonacciSeries() function in the main() method and printed the Fibonacci series.
*/