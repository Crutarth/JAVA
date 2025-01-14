// Lecture: 8.2 - Functions
// Write a program to make a function to calculate the sum of all odd numbers between 1 and n.

import java.util.*;

public class Functions5 {
    public static int sumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i; // sum of all odd numbers
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();

        int sum = sumOfOddNumbers(n); // calling the function

        System.out.println("Sum of all odd numbers between 1 and " + n + " is : " + sum);
    }
}


// Output:
// Enter the value of n : 
// 10
// Sum of all odd numbers between 1 and 10 is : 25

// Explanation:
/* 
    In this program, we have created a function sumOfOddNumbers() that takes an integer as an argument and returns the sum of all odd numbers between 1 and n.
    We have called the sumOfOddNumbers() function in the main() method and printed the sum of odd numbers.
*/