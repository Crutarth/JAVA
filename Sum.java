// Addition in java (Input & Output)

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // int a = 5, b = 7;
        // System.out.println(a+b);

        int a,b;
        System.out.println("Enter Value For a: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Enter Value For b: ");
        b = sc.nextInt();
        System.out.println("Sum: " + (a + b));
    }
}
