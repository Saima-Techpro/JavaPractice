package practices_dt.practice03;

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

        //  System.out.println((int)(Math.random()*6)+1);
        rollDice();

    }

    static int playerDice;
    static int computerDice;
    static int playerSecond;
    static int computerSecond;
    static int playerScore;
    static int computerScore;

    static int playerTotalScore = 0;
    static int computerTotalScore = 0;

    static int counter;

    public static void rollDice() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter R to roll the dice");
        String start = scan.next();

        do {
            if (start.equalsIgnoreCase("r")) {

                playerDice = (int) (Math.random() * 6) + 1;
                System.out.println("playerDice = " + playerDice);

                // to calculate the second when the dice is rolled
                playerSecond = LocalTime.now().getSecond();
                System.out.println("playerSecond = " + playerSecond);

                //condition
                if (playerSecond % 5 == 0) {
                    playerScore += playerDice * 5;
                    playerTotalScore +=playerScore;
                } else if (playerSecond % 2 == 0) {
                    playerScore += playerDice * 2;
                    playerTotalScore +=playerScore;
                } else {
                    playerScore += playerDice;
                    playerTotalScore +=playerScore;
                }
                System.out.println("playerScore = " + playerScore);

            } else if (! start.equalsIgnoreCase("r")){
                System.out.println("You can't roll the dice because you entered the wrong letter");
                break;
            } else {
                rollDice();
            }

            System.out.println("=======================");
            // to calculate same values for Computer
            computerDice = (int) (Math.random() * 6) + 1;
            System.out.println("computerDice = " + computerDice);

            // to calculate the second when the dice is rolled
            computerSecond = playerSecond + 1;
            System.out.println("computerSecond = " + computerSecond);

            //condition
            if (computerSecond % 5 == 0) {
                computerScore += computerDice * 5;
                computerTotalScore += computerScore;
            } else if (computerSecond % 2 == 0) {
                computerScore += computerDice * 2;
                computerTotalScore += computerScore;
            } else {
                computerScore += computerDice;
                computerTotalScore += computerScore;
            }
            System.out.println("computerScore = " + computerScore);
            System.out.println("=======================");

            // to roll the dice twice
            counter++;
            if (counter == 2){
                if (playerTotalScore > computerTotalScore) {
                    System.out.println("You won!! Your score is: " + playerTotalScore + " Computer score is: " + computerTotalScore);
                    break;
                } else if (playerTotalScore < computerScore) {
                    System.out.println("You lost!! Your score is: " + playerTotalScore + " Computer score is: " + computerTotalScore);
                    break;
                } else {
                    System.out.println("It's a DRAW! Your score is: " + playerTotalScore + " Computer score is: " + computerTotalScore);
                    break;
                }
            }

        } while (true);
    }


}
