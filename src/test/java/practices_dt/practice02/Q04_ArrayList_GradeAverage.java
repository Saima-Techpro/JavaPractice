package practices_dt.practice02;

import java.util.ArrayList;
import java.util.Scanner;

public class Q04_ArrayList_GradeAverage {
    /*
    Get as many grades as a teacher wants to enter and find the number of students pass the average
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter your exam grade please");
       // int grades = scan.nextInt();
        ArrayList<Integer> examGrades = new ArrayList<>();
        // examGrades.add(grades);
//        examGrades.add(scan.nextInt());  // in order to save memory, we can add grades directly in the list
//        System.out.println("examGrades = " + examGrades);

        // we don't know how many elements we are going to take, so do while loop is better

        do{
            System.out.println("Enter your exam grade please");
            examGrades.add(scan.nextInt());

            System.out.println("Continue:  Y/N");
            String condition = scan.next();

            if (condition.equalsIgnoreCase("N")){
                break;  // breaks the loop under this condition
            }


        }while (true);  // while (true) ==> INFINITE LOOP
        // as long as we do not use break code, this loop will keep repeating

        System.out.println("examGrades = " + examGrades);

        // Calculate the average
        // int sum =0;
        double sum =0;
        for (int w : examGrades){
            sum += w;
        }
        double average =  sum/examGrades.size();  // division operation between 2 int, it will remove decimal part.. so we will make sum ad double
        System.out.println("average = " + average);

        // Calculate how many students are above average

        int numOfStdAboveAvg = 0;
        for (int w: examGrades){
            if (w>average){
                numOfStdAboveAvg++;
            }
        }
        System.out.println("numOfStdAboveAvg = " + numOfStdAboveAvg);


    }
}
