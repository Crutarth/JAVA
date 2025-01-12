// lecture: 2.3 - Conditional Statements
// Program to print Hello, Namaste, Bonjour based on the button pressed.

import java.util.*;

public class Condition3 {
    public static void main(String[] args) {
        System.out.println("Press button 1,2 or 3: ");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        if (button == 1) {
            System.out.println("Hello");
        } else if (button == 2) {
            System.out.println("Namaste");
        } else if (button == 3) {
            System.out.println("Bonjour");
        } else {
            System.out.println("Invalid button");
        }
    }
}
