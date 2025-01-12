// lecture: 4.2 - Loops
// for loop for table no. is input by user from 1 to 10

import java.util.*;

public class Loops2 {
    public static void main(String[] args) {
        System.out.println("Enter the number for which you want to print the table: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}

// Output:
// Enter the number for which you want to print the table:  5
// 5 * 1 = 5 
// 5 * 2 = 10
// 5 * 3 = 15
// 5 * 4 = 20
// 5 * 5 = 25
// 5 * 6 = 30
// 5 * 7 = 35
// 5 * 8 = 40
// 5 * 9 = 45
// 5 * 10 = 50

