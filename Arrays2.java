// Lecture: 10.2
// write a program to take input from the user and store it in an array and then print the elements of the array.

import java.util.*;

public class Arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int n = sc.nextInt();
        int numbers[] = new int[n]; // declaration and instantiation of array (arrayname = new datatype[size])
    
        // input
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element at position " + i + " : ");
            numbers[i] = sc.nextInt();
        }

        // output
        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);
        }
    }
}


// Output:
// Enter the Array Size:
// 3
// Enter the element at position 0 :
// 96
// Enter the element at position 1 :
// 87
// Enter the element at position 2 :
// 89

// 96
// 87
// 89


// Explanation:
/* 
    In this program, we have created an array numbers of size n, where n is input by the user.
    We have used a for loop to take input from the user and store it in the array.
    We have used another for loop to iterate through the array and print the elements of the array.
    The output of the program will be the elements of the array numbers.
*/