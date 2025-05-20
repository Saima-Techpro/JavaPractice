package batch349_dt.practice01;

public class Q02_Concatenation {
    public static void main(String[] args) {

        // Task: Make a sentence with all the following variables:
        String var1 = "Bob";
        char var2 = '?';
        String var3 = "throw the ball";
        String var4 = "can you";
        String var5 = "times please";
        int var6 = 5;
        String var7 = "to me";

        System.out.println(var1 + var4 + var3 +  var7 + var6 +  var5 + var2);
        System.out.println(var1 + var4 + var3 +  var7 + var6*2 +  var5 + var2);
        System.out.println(var1 + var4 + var3 +  var7 + var6 +  var5 + var2*2);
        System.out.println(var1 + var4 + var3 +  var7 + var6 +  (var5 + var2));
        System.out.println(var1 + var4 + var3 +  (var7 + var6) +  var5 + var2);
        System.out.println(var6 + var2); // 68 => int + char => addition
        System.out.println(var6 + var5); // int + String => concatenation
        System.out.println(var1 + var2); // String + char => concatenation
        System.out.println(var1 + var3); // String + String => concatenation

        String sentence = var1 + " " + var4 + " " + var3 + " " + var7 + " " + var6 + " " + var5 + " " + var2;
        System.out.println(sentence);

        /*
        In Java, the "+" symbol performs addition when used between two numbers.
        In Java, the "+" symbol performs "concatenation" when used between two Strings or a String and a number.
        "Concatenation" operation merges values.
        Note: In concatenation operations, Java follows the mathematical order of operations.
        Java always processes instructions from top to bottom and left to right.

         Mathematical order of operations:
            1) Operations inside parentheses are performed first.
            2) Exponentiation operations are performed.
            3) Multiplication and division operations are performed.
            4) Addition and subtraction operations are performed.
            5) If operations have the same priority, they are executed from left to right in order.
         */


    }
}
