// Lecture: 8.4 - Functions
// Write a program to make a function to calculate the circumference of a circle.

import java.util.*;

public class Functions7 {
    public static double circumferenceOfCircle(double radius) {
        double area = 2 * 3.14 * radius; // formula for circumference of a circle is (2 * π * r) OR (π * d) 
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double radius = sc.nextDouble();

        double area = circumferenceOfCircle(radius); // calling the function

        System.out.println("The circumference of the circle is : " + area);
    }
}



// Output:
// Enter the radius :
// 5
// The circumference of the circle is : 31.400000000000002


// Explanation:
/* 
    In this program, we have created a function circumferenceOfCircle() that takes the radius of a circle as an argument and returns the circumference of the circle.
    We have called the circumferenceOfCircle() function in the main() method and printed the circumference value.
 */