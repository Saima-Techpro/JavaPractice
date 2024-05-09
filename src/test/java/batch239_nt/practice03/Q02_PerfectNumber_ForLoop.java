package batch239_nt.practice03;

import java.util.Scanner;

public class Q02_PerfectNumber_ForLoop {
    /*
     Type code to ask user to enter an integer and check if it is 'Perfect Number' or not."
        A perfect number is a positive integer that is equal to the sum of all its proper divisors.
        6 = 1+2+3, 28 = 1 + 2 + 4 + 7 + 14, (496 and 8128)
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        int sum = 0;

        for (int i =1; i <number ; i++) {
            if (number%i == 0){
                sum += i;
            }

        }
        if (sum==number){
            System.out.println(number + " is Perfect Number");
        }else {
            System.out.println(number + " is NOT a Perfect Number");
        }

    }
}
