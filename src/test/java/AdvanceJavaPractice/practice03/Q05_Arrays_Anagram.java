package AdvanceJavaPractice.practice03;

import java.util.Arrays;

public class Q05_Arrays_Anagram {
    /*
    Type code to check if two Strings are Anagram or not

    Anagram: A word or phrase made by using the letters of another word/phrase in a different order.
    Ex:
    dormitory -> dirty room
    debit card -> bad credit
    eleven plus two -> twelve plus one
    a decimal point -> I'm a dot in place
    vacation time -> I am not active
     */

    public static void main(String[] args) {
        System.out.println(isAnagram("dormitory", "dirty room"));
        System.out.println(isAnagram("debit card", "bad credit"));
        System.out.println(isAnagram("a decimal point", "I'm a dot in place"));
        System.out.println(isAnagram("334422", "442233"));  // add 0-9 to regex [^a-z0-9] and run the code

    }

    public  static boolean isAnagram(String str1, String str2){

        String[] arr1 = str1.toLowerCase().replaceAll("[^a-z]", "").split("");
        System.out.println(Arrays.toString(arr1));
        String[] arr2 = str2.toLowerCase().replaceAll("[^a-z]", "").split("");
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        if (Arrays.equals(arr1, arr2)){
            return true;
        }else {
            return false;
        }

    }
}
