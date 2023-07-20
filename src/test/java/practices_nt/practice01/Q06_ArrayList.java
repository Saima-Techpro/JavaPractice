package practices_nt.practice01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q06_ArrayList {
    public static void main(String[] args) {

        //    Ask user to enter an integer from 1 to 10
        //           If the number user entered exists in the Database(DB) change the number to "Bingo"
        //           If the number user entered does not exist in the DB add it into the DB
        //           If all records in the DB is "Bingo" give a message to the user like "You won!"



        List<String> dataBase = new ArrayList<>();
        dataBase.add("5");
        dataBase.add("7");
        dataBase.add("3");
        dataBase.add("9");
        System.out.println(dataBase);

        Scanner scan = new Scanner(System.in);
        int counter = 0;

        do{
            System.out.println("Enter any number from 1 to 10");
            String n = scan.next();
            int num = Integer.valueOf(n);

            if (num>10 || num<1){
                System.out.println("You should choose any number between 1 to 10");
            }

            if (dataBase.contains(n)){
                dataBase.set(dataBase.indexOf(n), "Bingo");
                counter++;
            }else {
                dataBase.add(n);
            }
            if (counter == dataBase.size()){
                System.out.println("You Won!!!");
                break;
            }

        } while (true);


    }

}
