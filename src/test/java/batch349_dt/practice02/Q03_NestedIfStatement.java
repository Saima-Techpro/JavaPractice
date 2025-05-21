package batch349_dt.practice02;

import java.util.Scanner;

public class Q03_NestedIfStatement {
    public static void main(String[] args) {

        //TASK: Check if a person can donate blood or not.
        // Requirements:
        //Age >= 18
        //Weight >= 50

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age please!");
        int age = scan.nextInt();


        // 1st way: Using 2 IF statements
        // First 'if statement' to check the age eligibility
//        if(age >= 18) {
//            System.out.println("You're eligible for blood donation.");
//        }else {
//            System.out.println("You're not eligible for blood donation because you're under 18.");
//        }
//
//        // Second 'if statement' to check the weight eligibility
//
//        System.out.println("Please enter your weight!");
//        double weight = scan.nextDouble();
//
//        if(weight >= 50 ){
//            System.out.println("You're eligible for blood donation. Please go to room 15 to see the nurse!");
//        }else {
//            System.out.println("You're not eligible for blood donation! Please gain some more weight by eating healthy food.");
//        }

        // 2nd way: Using NESTED IF statements


        if(age >= 18) {

            System.out.println("Please enter your weight!");
            double weight = scan.nextDouble();

            if(weight >= 50 ){
                System.out.println("You're eligible for blood donation. Please go to room 15 to see the nurse!");
            }else {
                System.out.println("You're not eligible for blood donation! Please gain some more weight by eating healthy food.");
            }

        }else{
            System.out.println("You're not eligible for blood donation because you're under 18.");
        }


    }
}
