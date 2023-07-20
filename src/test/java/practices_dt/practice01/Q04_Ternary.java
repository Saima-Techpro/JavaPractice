package practices_dt.practice01;

import java.util.Scanner;

public class Q04_Ternary {
    public static void main(String[] args) {

       /*
        Ask user to enter a character and check if it is a letter.

		 If it is not a letter print "Not Letter" on console.
		 If it is letter check if it is lowercase or uppercase letter.
		 If it is lowercase print "Lowercase Letter", if it is uppercase letter print "Uppercase Letter" on console.

        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a letter");
        char letter = scan.next().charAt(0);

        String output = (letter >='a' && letter <='z') || (letter >='A' && letter <= 'Z') ? (letter >='a' && letter <='z') ? "Lowercase Letter": "Uppercase Letter" : "Not a letter";

        System.out.println(output);



    }
}
