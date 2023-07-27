package AdvanceJavaPractice.practice02;

import java.util.ArrayList;
import java.util.Scanner;

public class Q04_ArrayList_GradeAverage {
    /*
    Get as many grades as a teacher wants to enter and find the number of students above the average
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> examGradeList = new ArrayList<>();

        do{
            System.out.println("Enter your grade");
            int grades = scan.nextInt();
            examGradeList.add(grades);

            System.out.println("Continue: Y/N");
            String condition = scan.next();

            if (condition.equalsIgnoreCase("n")){
                break; // => breaks teh loop from infinite run
            }

        }while (true); // => INFINITE LOOP
        System.out.println("examGradeList = " + examGradeList);

        // Calculate the average grade

        double sum = 0;

        for (int w : examGradeList){
            sum += w;  // sum = sum + w;
        }

        double average = sum/examGradeList.size();
        System.out.println("average = " + average);

        // Calculate the number of students above average
        int numOfStdAboveAvg = 0;

        for (int w : examGradeList){
            if (w>average){
                numOfStdAboveAvg++;
            }
        }
        System.out.println("numOfStdAboveAvg = " + numOfStdAboveAvg);

    }
}
