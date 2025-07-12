import java.util.*;

public class SumOfDigit{
    public static int Sum(int n){
        int ld ;
        int sum = 0;
        while(n>0){
            ld = n%10;
            sum+=ld;
            n/=10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scn.nextInt();
        System.out.print("The sum of Given number is: "+Sum(n));
    }
}