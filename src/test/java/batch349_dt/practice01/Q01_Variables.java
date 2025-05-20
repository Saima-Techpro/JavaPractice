package batch349_dt.practice01;

public class Q01_Variables {

    public static void main(String[] args) {
        /*
        There are two types of variables: Primitive and Non-Primitives.
        We store values in variables.
        Variables are passive objects.
         */

        // Task 1: Assign the sum of 2 numbers to a new variable and print the variable to the console.


        int a = 50;
        double b = 34.89;
        double c = (a+b);
        System.out.println("sum of two numbers:"+c); // 84.89

        // Task 2: Take the above sum and print only the whole part of the sum
        // Type casting

        // Solution 1:
        int wholePart = (int) c;
        System.out.println("Whole part of the sum: " + wholePart); // 84

        // Solution 2:
        int sum = a + (int) b; // There's a risk of getting incorrect sum
        System.out.println("sum without decimals: " + sum);

        // Solution 3:
        int total = (int) (a+b);
        System.out.println("total without decimals: " + total);

        System.out.println("=============================");

        double x = 6.9;
        double y = 7.8;
        double actualSum = x+ y;
        System.out.println("actualSum = " + actualSum); //14.7

        // Type casting y variable only BEFORE the addition
        System.out.println(x + (int) y); // 13.9

        // Type casting x variable only BEFORE the addition
        System.out.println((int) x + y); // 13.8

        // Type casting the variables BEFORE the addition
        System.out.println((int) x + (int) y); // 13

        // Type casting the result AFTER the addition
        System.out.println((int) +(x + y));  // 14

        System.out.println("=======================");

        int p = 76;
        int s = 87;
        int result = (p+s);
        System.out.println("result = " + result); // 163
        // Type casting

        System.out.println((double) p + s); // 163.0
        System.out.println(p + (double) s); // 163.0
        System.out.println((double) (p + s)); // 163.0



    }

}
