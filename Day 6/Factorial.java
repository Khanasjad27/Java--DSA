import java.util.*;

public class Factorial{
    public static int Factorial(int num){
        int fact = 1;
        for(int i = 1;i<=num;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scn.nextInt();
        int result = Factorial(num);
        System.out.print("Factorial of " +num +" is "+result);
    }
}