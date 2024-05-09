package batch239_nt.practice01;

import java.util.Scanner;

public class Q03_Scanner {
    public static void main(String[] args) {
        // Type a code that calculates the hypotenuse

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of one side of the right angle triangle");
        double a = scan.nextDouble();

        System.out.println("Enter the length of second side of the right angle triangle");
        double b = scan.nextDouble();

        double hypotenuse = Math.sqrt((a*a) + (b*b));
        System.out.println("hypotenuse = " + hypotenuse);
        System.out.println("hypotenuse after rounding up = " + Math.round(hypotenuse));


    }
}
