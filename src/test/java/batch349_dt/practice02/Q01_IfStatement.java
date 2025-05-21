package batch349_dt.practice02;

import java.util.Scanner;

public class Q01_IfStatement {
    public static void main(String[] args) {

        // If statements are used to check any given condition

        //Task 1: Take a number from the user and check if it is ODD or EVEN

        // 1. Create Scanner object
        Scanner scan = new Scanner(System.in);

        // 2. Send a message to the user
        System.out.println("Please enter a number!");

        // 3. Store the number provided by the user
        int number = scan.nextInt();

        // check if it is ODD or EVEN

        /*
        if(condition){
            the result / further data manipulation goes here
        }
         */
        if (number % 2 == 0){
            System.out.println(number + " is an EVEN number!");
        }else{
            System.out.println(number + " is an ODD number!");
        }

        //Task 2: Check if a number given by the user is Positive, Negative or Zero
        System.out.println("Please enter a number to check if it is positive or negative!");

        int number1 = scan.nextInt();

        if (number1 < 0){
            System.out.println(number1 + " is Negative number!");
        }else if (number1 > 0){
            System.out.println(number1 + " is positive number!");
        }else {
            System.out.println(number1 + " is Zero!");
        }
        /*
        if(){

        }else {
        };

        for(){

        };

        // non-parameterised method
        int add(){

        };

        // parameterised method
        int add(int a, int b){

        };

         */


    }
}
