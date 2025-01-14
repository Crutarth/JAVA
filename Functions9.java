// Lcture 8.7 - Functions
// write a  program entered the number till user wants and at the end it should display the count of positive, negative and zeros entered.

import java.util.*;

public class Functions9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int positive = 0;
        int negative = 0;
        int zero = 0;
        char choice;
        do {
            System.out.println("Enter a number: ");
            n = sc.nextInt();
            if (n > 0) {
                positive++;
            } else if (n < 0) {
                negative++;
            } else {
                zero++;
            }
            System.out.println("Do you want to continue? (Y/N)");
            choice = sc.next().charAt(0); // read the first character
        } while (choice == 'Y' || choice == 'y');
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zero numbers: " + zero);
    }
}



// Output:
// Enter a number:
// 5
// Do you want to continue? (Y/N)
// y
// Enter a number:
// 0
// Do you want to continue? (Y/N)
// n

// Positive numbers: 1
// Negative numbers: 0
// Zero numbers: 1


// Explanation:
// In this program, we have taken a number as input from the user and checked if it is positive, negative, or zero.
