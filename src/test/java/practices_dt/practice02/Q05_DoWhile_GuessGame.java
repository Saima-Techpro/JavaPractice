package practices_dt.practice02;

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

       // System.out.println(Math.random());  // returns random number between 0-1 where one is exclusive
       //  System.out.println(Math.random()*100);  // returns random number between 0-100 where 100 is exclusive
       //  System.out.println((int)(Math.random()*101));  // returns random number between 0-100 where 100 is inclusive

        int randomNumber = (int)(Math.random()*101);
       //  System.out.println("randomNumber = " + randomNumber);

        /*
        Random random = new Random();

         // Generate a random number between 0 and 100 (inclusive)
             int randomNumber = random.nextInt(101);
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Guess a number between 0 and 100");
        int number;

        int numOfAttempts = 10;

        do {
            numOfAttempts--;

            number = scan.nextInt();
            if (number < randomNumber){
                System.out.println("Enter a greater number");
            } else if( number > randomNumber){
                System.out.println("Enter a smaller number");

            } else {
                System.out.println("Congratulations! You found the number!!");
                break;
            }

            // Limit the number of attempts for the user
            if (numOfAttempts == 0){
                System.out.println("Sorry, you failed!! You couldn't guess the number");
                System.out.println("Continue: Y/N");
                String condition = scan.next();
                if (condition.equalsIgnoreCase("y")){
                    System.out.println("Guess a number between 0 and 100");
                    numOfAttempts = 10;
                    randomNumber = (int)(Math.random()*101);
                }else {
                    break;
                }

            }

        }while (true);

        System.out.println("Thanks for playing");


    }
}
