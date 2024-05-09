package batch239_dt.practice01;

import java.util.Scanner;

public class Q04_Scanner {
    public static void main(String[] args) {
        // Example: Ask user to enter first name and last name. Print their initials,
        // Tom Hanks => TH

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first name and last name");

        String fullName = scan.nextLine();
        System.out.println("fullName = " + fullName);

        char fistChar = fullName.charAt(0);
        System.out.println("fistChar = " + fistChar);

        char lastChar = fullName.split(" ")[1].charAt(0);
        System.out.println("lastChar = " + lastChar);

        System.out.println(fistChar +"" + lastChar);


    }
}
