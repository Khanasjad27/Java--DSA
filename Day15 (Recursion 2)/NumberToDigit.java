// package Day15 (Recursion 2);
//You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”.  Use a recursive function to solve this problem.NOTE-The digits of the number will only be in the range 0-9 and the lastdigit of a number can’t be 0

import java.util.Scanner;

public class NumberToDigit {
    public static void toDigit(Integer n){
        String digits[] = {"zero", "one", "two", "three", "four", "five", "six" , "seven", "eight", "nine"};

        if(n == 0){
            return;
        }

        int lastDigit = n%10;
        toDigit(n/10);
        System.out.print(digits[lastDigit]+" ");
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number: ");
        Integer n = scn.nextInt();
        toDigit(n);
    }
}
