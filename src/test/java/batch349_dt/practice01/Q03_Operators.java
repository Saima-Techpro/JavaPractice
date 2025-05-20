package batch349_dt.practice01;

public class Q03_Operators {
    public static void main(String[] args) {
     /*
       > , < , && , == , ||, & !=
     */

     boolean result1 = 5 > 4 && 7 < 9 && 6 + 3 ==  9 && 5+2 != 8;
     System.out.println("result1 = " + result1); // true

     boolean result2 = 5 > 4 && 7 > 9 && 6 + 3 == 9 && 5 + 2 != 8;

     System.out.println("result2 = " + result2); // false

     boolean result3 = 5 > 4 & 7 > 9 & 6 + 3 == 9 & 5 + 2 != 8;

     System.out.println("result3 = " + result3);// false

     boolean result4 = 5 > 4 | 7 > 9 | 6 + 3 == 9 & 5 + 2 != 8;

     System.out.println("result4 = " + result4); // true

        // Task 2:
        int num1 = 40;
        int num2 = 60;
        int num3 = 30;
        System.out.println(num1 > 30 && num1 < 70); // true
        System.out.println(num3 < 100 || num2 > 80); // true
        System.out.println(num2 >= 60 && num3 != 70); // true
        System.out.println(num3 != num2 && num2 > num1); // true
        System.out.println(num3 < 30 || num2 > 50 && num2 != 70); // true
        System.out.println(num3 < 30 || num2 > 50 && num2 == 70); // false
        System.out.println(num3 < 30 && num2 > 50 || num2 == 70); // false

        /*
        && operator is the strict one => ALL conditions have to be true for this operator to return true
        || operator is the generous one => Any ONE condition is true, it returns true.
         */


    }
}
