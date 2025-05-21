package batch349_dt.practice02;

import java.util.Scanner;

public class Q02_IfStatement {
    public static void main(String[] args) {

        //TASK: Ask the user for grades out of 100. Convert the grades to the letter-grading system.
        //If less than 50   -> Print "D"
        //If =50 < 60       -> Print "C"
        //If =60 < 80       -> Print "B"
        //If =80 < 100      -> Print "A"

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your marks");
        int grade = scan.nextInt();


        if(grade > 100 || grade < 0){
            System.out.println("The grade you provided is invalid!");

        } else if (grade < 50){
            System.out.println("D");

        } else if (grade < 60) {
            System.out.println("C");


        } else if (grade < 80) {
            System.out.println("B");


        }else{
            System.out.println("A");
        }


    }
}
