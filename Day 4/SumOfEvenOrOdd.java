//Write a program that reads a set of integers,and then prints the sum of the even and odd integers
import java.util.*;

public class SumOfEvenOrOdd{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        int choice;
        int evenSum = 0;
        int oddSum = 0;
        int n;

        do{
            System.out.print("Enter number: ");
            n = scn.nextInt();
            if(n%2 == 0){
                evenSum +=n;
            }else{
                oddSum +=n;
            }

            System.out.println("DO YOU WANT TO CONTINUE? PRESS 1 FOR YES AND 2 FOR NO");
            System.out.print("Enter Choice: ");
            choice = scn.nextInt();
        }while(choice == 1);


        System.out.println("Sum of Even numbers is "+evenSum);
        System.out.println("Sum of odd numbers is "+oddSum);
    }
}