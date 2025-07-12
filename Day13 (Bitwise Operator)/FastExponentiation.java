// package Day13 (Bitwise Operator);
import java.util.*;

public class FastExponentiation {

    public static int Expo(int a, int n){
        int ans = 1;

        while (n>0) {
            if((n&1) != 0){
                ans  = ans *a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter base number : ");
        int a = scn.nextInt();
        System.out.print("Enter exponent val : ");
        int n = scn.nextInt();
        System.out.println(Expo(a,n));
    }
}
