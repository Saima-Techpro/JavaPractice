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

        Scanner scan = new Scanner(System.in);

     //   System.out.println(Math.random()); // will always get number between 0 and 1 but never get 1 .. 1 is exclusive
     //    System.out.println((int)Math.random()*100);  => will always return 0 coz its type casting first and then multiplying
     //   System.out.println((int) (Math.random()*100)); // => will return numbers b\w 0  and 0.999 which will always return 99.9 and will never get 100
     //   System.out.println((int) (Math.random()*101));  // this will return a random number b\w 0 and 100

        int randomNumber = (int) (Math.random()*101);
        System.out.println("randomNumber = " + randomNumber);

        System.out.println("Guess a number between 0-100");
        int num;

        int numOfAttempts = 10;

        do{
            numOfAttempts--;
            num = scan.nextInt();
            if (num < randomNumber){
                System.out.println("Enter a greater number");
                System.out.println("You have " + numOfAttempts + " guess(s) left!");
            }else if (num > randomNumber){
                System.out.println("Enter a smaller number");
                System.out.println("You have " + numOfAttempts + " guess(s) left!");
            }else {
                System.out.println("Congratulations! You guessed the right number!");
                System.out.println("You guessed the number in "+(10-numOfAttempts)+ " attempt(s)!");
                System.out.println("You scored: " + (numOfAttempts+1)*10 + " points");  // in 1 attempt => 100 points
                break;
            }

            // you can make the game a little harder by limiting number of attempts for user
            if (numOfAttempts==0){
                System.out.println("You failed! You could not find the number in 10 attempts");
                System.out.println("Continue: Y/N");
                String condition = scan.next();

                if (condition.equalsIgnoreCase("Y")){
                    System.out.println("Guess a number between 0-100");
                    numOfAttempts = 10;
                    randomNumber = (int) (Math.random()*101);
                }else {
                    break;
                }
            }

        }while (true);

        System.out.println("Bye!");











    }
}
