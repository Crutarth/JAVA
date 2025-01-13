// lecture: 7 - Functions
// Write a program to print your name using a function by taking input from the user.

import java.util.*;

public class Functions {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printMyName(name); // calling the function
    }
}


// Output:
// Enter your name:
// Krutarth 
// Krutarth

// Explanation:
/*
    In this program, we have created a function printMyName() that takes a string as an argument and prints it.
    In the main function, we take the name as input from the user and pass it to the printMyName() function.
    The printMyName() function prints the name passed to it.
    This way, we can use functions to perform a specific task and reuse the code wherever required.
 */