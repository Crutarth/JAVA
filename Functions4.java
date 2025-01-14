// Lecture: 8.1 - Functions
// Write a program to make a function to calculate the average of three numbers.

import java.util.*;

public class Functions4 {
    public static int average(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int avg = average(a, b, c); // calling the function

        System.out.println("Average of three numbers is : " + avg); 
    }
}


// Output:
// Enter three numbers :
// 10
// 20
// 30
// Average of three numbers is : 20


// Explanation:
/* 
    In this program, we have created a function average() that takes three integers as arguments and returns the average of those numbers.
    We have called the average() function in the main() method and printed the average value.
*/