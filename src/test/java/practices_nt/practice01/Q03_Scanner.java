package practices_nt.practice01;

import java.util.Scanner;

public class Q03_Scanner {
    public static void main(String[] args) {
        // Type a code that calculates the hypotenuse

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of first leg of the rightangle triangle");
        double a = scan.nextDouble();

        System.out.println("Enter the length of second leg of the rightangle triangle");
        double b = scan.nextDouble();

        double hypotenuse = Math.sqrt((a*a) + (b*b));
        System.out.println("hypotenuse = " + hypotenuse);


    }
}
