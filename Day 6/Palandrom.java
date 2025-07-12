// Write a Java program to check if a number is a palindrome in Java?(121 is a palindrome, 321 is not)
import java.util.*;

public class Palandrom{
    public static void is_Palandrom(int n){
        int org = n;
        int ld;
        int rev = 0;
        while(n>0){
            ld = n%10;
            rev=rev*10+ld;
            n/=10;
        }

        if(rev == org){
            System.out.print(org+" is Palandom");
        }else{
             System.out.print(org+" is not Palandom");
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scn.nextInt();
        is_Palandrom(n);
    }
}