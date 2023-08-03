package practices_nt.practice02;

import java.util.Random;
import java.util.Scanner;

public class Q05_DoWhile_GuessGame {

    /*
    Type code for a game that finds random numbers between 0 and 100
    Hint:
        If the number you entered is less than random number, print => Enter a greater number
        If the number you entered is greater than random number, print => Enter a smaller number
        If the number you entered is equal to the random number, print => Congratulations! You found the number

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         // System.out.println(Math.random()*100);  // returns any number between 0 and 100 where 100 is exclusive
        //  System.out.println((int) (Math.random()*101));  // returns any number between 0 and 100 where 100 is inclusive

        int randomNumber = (int) (Math.random()*101);
        System.out.println("randomNumber = " + randomNumber);

//        Random random = new Random();
//        int randomNum = random.nextInt(101);
//        System.out.println(randomNum);

        System.out.println("Enter a number");

        int number;
        int numOfAttempts = 10;

        do{
            numOfAttempts--;
             number = scan.nextInt();

            if (number<randomNumber){
                System.out.println("Enter a greater number");
                System.out.println("You have "+numOfAttempts+" attempt(s) left!");

            }else if(number>randomNumber){
                System.out.println("Enter a smaller number");
                System.out.println("You have "+numOfAttempts+" attempt(s) left!");
            }else {
                System.out.println("Congratulations! You found the number!");
                System.out.println("You have guessed the number in "+(10-numOfAttempts)+" attempt(s)");
                System.out.println("You scored "+ (numOfAttempts +1)*10 +" points");
                break;
            }

            // in case, user can't guess the number in 10 attempts
            if (numOfAttempts==0){
                System.out.println("You failed! You could not guess the number!!");
                System.out.println("Continue: Y/N");
                String condition = scan.next();
                System.out.println("Enter a number");
                if (condition.equalsIgnoreCase("y")){
                    numOfAttempts = 10;
                    randomNumber = (int) (Math.random()*101);
                }else {
                    break;
                }
            }

        }while (true);
        System.out.println("Bye! Thanks for playing");


    }

}
