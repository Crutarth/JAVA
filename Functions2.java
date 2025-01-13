// Lecture: 7.2 - Functions
// Write a program to make a function to multiply 2 numbers and return the product.

import java.util.*;

public class Functions2 {
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int product = multiply(a, b); // calling the function

        System.out.println("The product of two numbers is: " + product); 
    }    
}


// Output:
// Enter two numbers:
// 5
// 6
// The product of two numbers is: 30

// Explanation:

/* 
    In this program, we have created a function multiply() that takes two integers as arguments and returns their product.
    In the main function, we take two numbers as input from the user and pass them to the multiply() function.
 */