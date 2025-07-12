/* income < 5l  => Tax = 0
income btw 5l to 10l  => Tax = 20%
income > 10  => Tax = 30% */

// All figures are in terms of lakhs
import java.util.*;

public class IncomeTaxCalculation{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        // Input
        float income = scn.nextFloat();
        float tax;

        // Condition
        if(income>10){
            tax = income*.30f;
        }
        else if(income>=5 && income<=10){
            tax = income*.20f;
        }
        else{
            tax = 0;
        }
        System.out.println("The tax is: "+ tax);
    }
}