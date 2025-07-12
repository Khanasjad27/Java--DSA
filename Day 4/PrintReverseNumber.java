import java.util.*;

public class PrintReverseNumber{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scn.nextInt();
        int LD = 0;   // LAst Digit
        while(n>0){
            LD = n%10;
            System.out.print(LD+ " ");
            n = n/10;
        }
    }
}