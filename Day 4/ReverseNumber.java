import java.util.*;

public class ReverseNumber{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scn.nextInt();
        int LD ;   // LAst Digit
        int rev = 0;
        while(n>0){
            LD = n%10;
            rev = (rev*10)+LD;
            n = n/10;
        }
        System.out.println(rev);
    }
}