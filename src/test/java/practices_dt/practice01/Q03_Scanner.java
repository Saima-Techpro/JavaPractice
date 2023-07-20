package practices_dt.practice01;

import java.util.Scanner;

public class Q03_Scanner {
    public static void main(String[] args) {
        // Type a code that calculates the hypotenuse


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of one leg of the right triangle");
        double a = scan.nextDouble();

        System.out.println("Enter the length of the second leg of the right triangle");
        double b = scan.nextDouble();

        double c = Math.sqrt((a*a)+(b*b));

        System.out.println("Hypotenuse: " +c);




    }
}
