package practices_dt.practice01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q06_ArrayList {
    public static void main(String[] args) {

        //    Ask user to enter an integer from 1 to 10

        //          If the number user entered exists in the Database(DB), change the number to “Bingo”
        //          If the number user entered does not exist in the DB, add it into the DB
        //          If all records in the DB is “Bingo”, give a message to the user like “You won!”


        List<String> dataBase = new ArrayList<>();
        dataBase.add("4");
        dataBase.add("7");
        dataBase.add("1");

        System.out.println("dataBase = " + dataBase);

        int counter = 0;

        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Enter a number from 1 to 10");
            String n = scan.next();
            int num = Integer.valueOf(n);

            if (num<1 || num>10){
                System.out.println("Choose the number from 1 to 10 please");
                continue;
            }

            if (dataBase.contains(n)){
                dataBase.set(dataBase.indexOf(n), "Bingo");
                counter++;
                // System.out.println(dataBase);
            }else {
                dataBase.add(n);
                // System.out.println(dataBase);
            }

            if (counter == dataBase.size()){
                System.out.println("You Won!!");
                break;
            }

        }while (true);




    }
}
