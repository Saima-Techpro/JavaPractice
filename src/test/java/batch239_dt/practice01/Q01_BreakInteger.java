package batch239_dt.practice01;

public class Q01_BreakInteger {
    public static void main(String[] args) {

        /*
        Task: Write a Java programme to break an integer into a sequence of individual digits.
Hint: use / and %
x: input: 12345
output:        1
               2
               3
               4
               5

         */


        int x = 12345;
        int ones = x%10; // 12345 % 10 => 1234.5 => 5
        System.out.println("ones = " + ones);

        int tens = (x/10)%10;  // 12345/10 => 1234 % 10 => 4
        System.out.println("tens = " + tens);

        int hundreds = (x/100)%10;  // 12345/100 => 123.45 % 10 => 3
        System.out.println("hundreds = " + hundreds);

        int thousands = (x/1000)%10;  // 12345/1000 => 12.345 % 10 => 2
        System.out.println("thousands = " + thousands);

        int tenThousands = (x/10000)%10;  // 12345/10000 => 1.2345 % 10 => 1
        System.out.println("tenThousands = " + tenThousands);

        // camelCase, snake_case, PASCAL_CASE, kebab-case   => naming conventions

        System.out.println(tenThousands +"\n" +thousands + "\n" + hundreds +"\n"+ tens +"\n" + ones);



    }
}
