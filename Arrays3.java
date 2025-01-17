// Lecture: 10.3
// Take an array as input from the user. Search for a given number x and print the index of the number.

import java.util.*;

public class Arrays3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int n = sc.nextInt();
        int numbers[] = new int[n]; //declaration and instantiation of array

        //input
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element at position " + i + " : ");
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        //output
        for (int i = 0; i < n; i++) {
            if (numbers[i] == x) {
                System.out.println("x found at index :" + i);
                break;
            }
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

// 87
// x found at index :1


// Explanation:
/* 
    In this program, we have created an array numbers of size n, where n is input by the user.
    We have used a for loop to take input from the user and store it in the array.
    We have taken another input x from the user.
    We have used another for loop to iterate through the array and search for the number x.
    If the number x is found in the array, we print the index of the number and break out of the loop.
    The output of the program will be the index of the number x in the array numbers.
*/