// lecture: 2.2 - Conditional Statements
// Program to check which number is a greater number or lesser number or equal number.

import java.util.*;

public class Condition2 {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter Value For a: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Enter Value For b: ");
        b = sc.nextInt();
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(a + " is lesser than " + b);
        } else {
            System.out.println(a + " is equal to " + b);
        }
    }
}
