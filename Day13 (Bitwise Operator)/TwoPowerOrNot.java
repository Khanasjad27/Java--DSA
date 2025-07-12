
import java.util.*;
public class TwoPowerOrNot {
    public static boolean power(int n){
        if((n & (n-1)) == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number in Decimal: ");
        int n = scn.nextInt();
        System.out.println(power(n));
    }
}
