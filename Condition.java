// lecture: 2 - Conditional Statements
// Program to check if a person is eligible to vote or not based on the age.

import java.util.Scanner;

public class Condition {

    public static void main(String[] args) {
        System.out.println("Enter the age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote!");
        }
    }
}