//Write a Java program that takes a year from the user and print whether that year is a leap year or not.

import java.util.*;
public class LeepYear{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = scn.nextInt();

        if(year%4 == 0 ){
            if(year%100 == 0 ){
                if(year%400 == 0 ){
                    System.out.println(year+" is leap year");
                }
                else{
                    System.out.println(year+" is not leap year");
                }
            }
            else{
                System.out.println(year+" is leap year");
            }
                    
        }
        else{
            System.out.println(year+" is not leap year");
        }
    }
}