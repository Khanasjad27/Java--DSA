import java.util.*;

public class PrimeOrNotUsingFn{
    public static boolean Prime(int n){


        // true => Prime
        // false => Not Prime
        boolean is_Prime = true;
        // for n=2
        if(n==2){
            return is_Prime;
        }
        // for n>2
        for(int i = 2; i<=Math.sqrt(n);i++){
            if(n%i == 0){
                is_Prime = false;
            }
        }
        return is_Prime;

    }

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        // Input
        System.out.print("Enter Number to check wether it is prime or not: ");
        int n = scn.nextInt();

        System.out.println(Prime(n));
    }
}