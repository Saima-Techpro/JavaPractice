package practices_dt.practice02;

import java.util.Scanner;

public class Q01_IfStatement_SalaryBonus {
    /*
    A company decided to give bonus of 5% of salary to the employee if his/her year of
    service is 5 and more than 5 years.
    Ask user for their salary and year of service and print the net bonus amount.
    If employee can not get bonus, print how many years he/she should work more.

    EXAMPLE:
    INPUT  :   Year     => 4 years service
               Salary   => 4000

    OUTPUT:   You need to work 1 more year(s) to get bonus

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your year of service");
        int year = scan.nextInt();

        System.out.println("Enter your salary");
        // int salary = scan.nextInt();
        double salary = scan.nextDouble();

        if (year >=5){
            //int bonus = salary * 5/100 ;   // we have to use one value as double otherwise Java will not show decimal part
            // so we will change salary into double data type

            double bonus = salary * 5/100;
            System.out.println("Your bonus is: " + bonus);
        }else {
            System.out.println("You need to work "+ (5-year) +" year(s) more to get any bonus!");
        }

        // if user enters -ve values for year or salary, we can handle that with Math.abs()
        // int year = Math.abs(scan.nextInt());
        // double salary = Math.abs(scan.nextDouble());
        // double salary = Math.abs(scan.nextDouble());

    }
}
