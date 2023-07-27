package practices_dt.practice02;

import java.util.ArrayList;
import java.util.Scanner;

public class Q04_ArrayList_GradeAverage {

    /*
    Get as many grades as a teacher wants to enter and find the number of students pass the average
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> examGradesList = new ArrayList<>();


        do{
            System.out.println("Enter the grade");
            int grades = scan.nextInt();
            examGradesList.add(grades);

            System.out.println("Continue: Y/N");
            String condition= scan.next();

            if (condition.equalsIgnoreCase("n")){
                break;
            }

        }while(true);  // Infinite loop

        System.out.println("examGradesList = " + examGradesList);

        // Calculate the average
        double sum = 0;
        for (int w : examGradesList) {
            sum += w;
        }

        double average =sum/examGradesList.size();
        System.out.println("average = " + average);
        
        // Calculate number of students above average
        int numOfStdAboveAvg = 0;
        
        for (int w: examGradesList){
            if (w>average){
                numOfStdAboveAvg++;
            }
        }
        System.out.println("numOfStdAboveAvg = " + numOfStdAboveAvg);

    }

}
