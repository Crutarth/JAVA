// Lecture: 8.5 - Functions
// Write a program to make a function to check if a person is eligible to vote or not.

import java.util.*;

public class Functions8 {

    public static void eligibleforVote(int age) {
        if (age >= 18) {
            System.out.println("Yes, You are eligible to vote!");
        } else {
            System.out.println("No, You are not eligible to vote!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();

        eligibleforVote(age); // calling the function
    }
}



// Output:
// Enter Your Age:
// 20
// Yes, You are eligible to vote!


// Explanation:
// In this program, we have created a function eligibleforVote() that takes an integer age as an argument and checks if the person is eligible to vote or not based on the age.