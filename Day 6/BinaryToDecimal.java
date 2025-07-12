import java.util.*;

public class BinaryToDecimal{
    public static int Decimal(int n){
        int LD;
        int power = 0;
        int dec = 0;
        while(n>0){
            LD = n%10; 
            n/=10;
            dec += LD*(Math.pow(2,power));
            power++;
        }

        return dec;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scn.nextInt();
        System.out.print("Decimal: "+ Decimal(n));
    }
}