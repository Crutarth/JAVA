// lecture: 2.4 - Switch Case
// write a program to print Hello, Namaste, Bonjour to press button using switch case.

import java.util.*;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Press button 1,2 or 3: ");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch (button) {
            case 1:
            System.out.println("Hello");
            break;
            case 2:
            System.out.println("Namaste");
            break;
            case 3:
            System.out.println("Bonjour");
            break;
            default:
            System.out.println("Invalid button");
        }
    }
}
