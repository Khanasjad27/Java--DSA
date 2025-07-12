import java.util.*;

public class DecimalToBinary{
    public static void Binary(int n){
        int Bin = 0;
        int R ;  // R => Remainder
        int power = 0;
        while(n>0){
            R = n%10; 
            Bin = Bin + R*(int)(Math.pow(10,power));
            power++;
            n = n/2;
        }
        System.out.print(Bin);
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scn.nextInt();
        Binary(n);
    }
}