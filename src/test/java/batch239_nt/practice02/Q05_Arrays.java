package batch239_nt.practice02;

public class Q05_Arrays {
    public static void main(String[] args) {

        // Create a String array, add 5 elements in it, find the sum of the number of the characters in all Strings.

        String[] cities = {"Istanbul", "Baku", "London", "New York", "Tokyo" };

        int sum = 0;

        for (String w : cities){
            sum+= w.length();
        }
        System.out.println(sum);





    }
}
