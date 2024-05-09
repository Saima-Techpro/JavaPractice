package batch239_nt.practice01;

import java.util.Scanner;

public class Q02_Scanner {
    public static void main(String[] args) {
        /*
Task: Ask user to enter his/her first name, age, height, and weight.
    Using single System.out.println(); print all input values on the console in this way:

First Name: …
Last Name: …
Age: …
Height: …
Weight: …

Note: Use only on “System.out.println();”

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.nextLine();

        System.out.println("Enter your last name");
        String lastName = scan.nextLine();

        System.out.println("Enter your age");
        int age = scan.nextInt();
        // byte age = scan.nextByte();

        System.out.println("Enter your height");
        double height = scan.nextDouble();

        System.out.println("Enter your weight");
        double weight = scan.nextDouble();

        System.out.println("First Name: " + firstName + "\nLast Name: " + lastName + "\nAge: " + age + "\nHeight: " + height + "\nWeight: " + weight);


    }
}
