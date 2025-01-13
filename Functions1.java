// Lecture: 7.1 - Functions
// Write a program to make a function to add 2 numbers and return the sum.

import java.util.*;

public class Functions1 {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt(); 
        int num2 = sc.nextInt();

        int sum = add(num1, num2); // calling the function

        System.out.println("The sum of two numbers is: " + sum); 
    }
}


// Output:
// Enter two numbers:
// 5
// 6
// The sum of two numbers is: 11

// Explanation:
/*
    In this program, we have created a function add() that takes two integers as arguments and returns their sum.
    In the main function, we take two numbers as input from the user and pass them to the add() function.
    The add() function calculates the sum of the two numbers and returns it.
    The sum is then printed in the main function.
    This way, we can create functions to perform specific tasks and reuse them wherever required.
 */