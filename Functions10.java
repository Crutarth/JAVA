// Lecture: 8.8 - Functions
// Write a program to make a function to take values of x and n and calculate x^n.

import java.util.*;

public class Functions10 {
    static double power(int x, int n) {
        double result = 1;
        for (int i = 0; i < n; i++) {
            result = result * x; // x^n = x*x*x*...*x (n times) or result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        int x, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        x = sc.nextInt();
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();

        System.out.println(power(x, n));
    }
}


// Output:
// Enter the value of x:
// 2
// Enter the value of n:
// 3
// 8.0


// Explanation:
/* 
    In this program, we have created a function power() that takes two integers x and n as arguments and returns the value of x raised to the power n.
    We have called the power() function in the main() method and printed the result.
*/