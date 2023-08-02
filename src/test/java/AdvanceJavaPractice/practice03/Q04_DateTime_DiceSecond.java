package AdvanceJavaPractice.practice03;

import java.time.LocalTime;
import java.util.Scanner;

public class Q04_DateTime_DiceSecond {

    /*
     Write a method that rolls two dice and compares the result with the score of the computer
     by multiplying the result with 2 or 5 according to the second it was.
     When the dice is rolled, if the second is a multiple of 5, the number of dice will be multiplied by 5 and added to the score.
     When the dice is rolled, if the second is a multiple of 2, the number of dice will be multiplied by 2 and added to the score.
     When the dice is rolled, if the second is an odd number, the number of dice will be added to the score.
     */

    public static void main(String[] args) {
        // System.out.println((int)(Math.random()*6)+1);

        rollDice();

    }

    static int playerDice;
    static int computerDice;
    static int playerSecond;
    static int computerSecond;
    static int playerScore;
    static int computerScore;
    static int counter;

    // To roll dice
    public static void rollDice(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter R to roll dice");

        if (scan.next().equalsIgnoreCase("r")){
            playerDice = (int)(Math.random()*6)+1;
            System.out.println("playerDice = " + playerDice);

            // to catch the second when dice is rolled
            playerSecond = LocalTime.now().getSecond();
            System.out.println("playerSecond = " + playerSecond);

            // condition
            if (playerSecond % 5==0){
                playerScore += playerDice * 5;
            } else if (playerSecond % 2 ==0){
                playerScore += playerDice * 2;
            }else {
                playerScore += playerDice;
            }

            System.out.println("playerScore: "+playerScore);


        }else {
            rollDice();  // to create a loop
        }

        computerDice = (int)(Math.random()*6)+1;
        System.out.println("computerDice = " + computerDice);

        // to catch the second when dice is rolled
        computerSecond = playerSecond+1;
        System.out.println("computerSecond = " + computerSecond);

        // condition
        if (computerSecond % 5==0){
            computerScore += computerDice * 5;
        } else if (computerSecond % 2 ==0){
            computerScore += computerDice * 2;
        }else {
            computerScore += computerDice;
        }

        System.out.println("computerScore: "+computerScore);



        counter++;
        if (counter==2){
            if (playerScore>computerScore){
                System.out.println("You win!! Your score is: " + playerScore);
            }else if (computerScore>playerScore){
                System.out.println("You lost!! Your score is: " + playerScore + " and computer score is: " + computerScore);
            }else {
                System.out.println("It's a DRAW!! Your score is: " + playerScore + " and computer score is: " + computerScore);
            }





        }else {
            rollDice();
        }








    }
}
