// Lecture: 10
// Arrays

import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        int[] marks = new int[3]; // declaration and instantiation of array
        marks[0] = 96; // initializing array
        marks[1] = 87;  
        marks[2] = 89;

        // System.out.println(marks[0]); // accessing array elements
        // System.out.println(marks[1]);
        // System.out.println(marks[2]); 

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}


// Output:
// 96
// 87
// 89

// Explanation:
/* 
    In this program, we have created an array marks of size 3 and initialized it with some values.
    We have used a for loop to iterate through the array and print the elements of the array.
    The output of the program will be the elements of the array marks.
*/