package practices_dt.practice02;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q02_Regex_FullName {
    /*
    Divide the 2-word name and surname you will receive from the user into separate words.
    Print the name and surname on the screen separately.

    EXAMPLE:
    INPUT: John Doe

   OUTPUT:
   First name: John
   Surname: Doe
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name and last name with a space between");
        String fullName = scan.nextLine().replaceAll("[^a-zA-Z ]","").replaceAll("\\s+", " ").trim();  // include a space inside first regex [^a-zA-Z ] as well if you don't want to remove the middle space
                                                                                             // "\\s+" means more than one spaces in regex
        String firstName = fullName.split(" ")[0].substring(0,1).toUpperCase() + fullName.split(" ")[0].substring(1).toLowerCase();
        String surName = fullName.split(" ")[1].substring(0,1).toUpperCase() + fullName.split(" ")[1].substring(1).toLowerCase();


        System.out.println("First name: " + firstName + "\n Surname: " + surName);










    }


}
