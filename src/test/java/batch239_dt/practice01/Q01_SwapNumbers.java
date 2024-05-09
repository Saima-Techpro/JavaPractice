package batch239_dt.practice01;

public class Q01_SwapNumbers {
    public static void main(String[] args) {

        // Example: Type code to swap two integers  => Interview Question

        int a = 12;
        int b = 5;
        System.out.println("Before swap: " + a + " " + b );  // concatenation

        int temp = 0; // temp container
        temp = a;
        a=b;
        b=temp;

        System.out.println("After swap: " + a + " " + b );

        // 2nd way:  without creating temp container

        int x = 17 , y = 9;

        System.out.println("Before swap: " + x + " " + y );
        x = x+y;  // 17+9= 26
        y= x-y;   // 26-9= 17
        x= x-y;    // 26-17= 9

        System.out.println("After swap: " + x + " " + y );















    }
}
