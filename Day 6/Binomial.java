import java.util.*;

public class Binomial{
    public static int Factorial(int num){
        int fact = 1;
        for(int i = 1;i<=num;i++){
            fact = fact*i;
        }
        return fact;
    }

    public static int BinFact(int n, int r){
        return Factorial(n)/(Factorial(r)*Factorial(n-r));
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in); 

        System.out.print("Enter number(n): ");
        int n = scn.nextInt();

        System.out.print("Enter number(r): ");
        int r = scn.nextInt();

        int result = BinFact(n,r);     // nCr = n!/r!*(n-r)!

        System.out.print("Bimonial is "+result);
    }
}