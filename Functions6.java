// Lecture: 8.3 - Functions
// Write a program to make a function which takes two integers as input and returns the greater of the two numbers.

import java.util.*;

public class Functions6 {
    public static int greater(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();

        int num = greater(a, b); // calling the function

        System.out.println("The greater number is : " + num);
    }
}


// Output:
// Enter the value of a :
// 10
// Enter the value of b :
// 20
// The greater number is : 20


// Explanation:
/* 
    In this program, we have created a function greater() that takes two integers as arguments and returns the greater of the two numbers.
    We have called the greater() function in the main() method and printed the greater number.
*/