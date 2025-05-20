package batch349_dt.practice01;

import java.util.Scanner;

public class Q04_Scanner {
    public static void main(String[] args) {

     // Task: Print the circumference and the area of a circle. Take the radius from the user
        // circumference: 2*pi*radius

        // Step 1: Create a Scanner object
        Scanner scan = new Scanner(System.in);

        // Step 2: Ask the user
        System.out.println("Please enter the radius of the circle");

        // Step 3:Take the input and assign it to a variable
        double radius = scan.nextDouble();

        // Step 4: Calculate the area and circumference

        // area = pi*radius*radius
        double pi = 3.14;
        //double area = pi * radius * radius;
        double area = Math.PI * radius * radius;
        System.out.println("area = " + area);

        // circumference= 2*pi*radius
        double circumference = 2 * pi * radius;
        System.out.println("circumference = " + circumference);


    }
}
