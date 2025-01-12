// lecture: 2.1 - Conditional Statements
// write a program to check number is odd or even.

import java.util.*;

public class Condition1 {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
