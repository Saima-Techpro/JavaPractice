package batch239_nt.practice02;

import java.util.Scanner;

public class Q03_NestedLoop_NumberTriangle {

     /*
    Type code to ask user to enter the number of rows and print the
    shape below according to that number:
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
    16 17 18 19 20 21
     */
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter the number of rows");
         int row = scan.nextInt();
         System.out.println("row = " + row);

         int number = 1;
         for (int i=0; i<row; i++){ // outer loop is used for row control

             for (int j=0; j<=i ; j++){
                 // System.out.print("* ");
                 System.out.print(number + " ");
                 number++;

             }
             System.out.println();
         }



     }
}
